package com.meli.obterdiploma.repository;

import com.meli.obterdiploma.exception.StudentNotFoundException;
import com.meli.obterdiploma.model.StudentDTO;
import com.meli.obterdiploma.util.TestUtilsGenerator;
import org.junit.jupiter.api.*;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;


class StudentDAOTest {
    private IStudentDAO studentDAO;

    @AfterAll
    public static void tearDown(){
        // limpa o arquivo depois de executar todos os métodos
        TestUtilsGenerator.emptyUsersFile();
    }

    @BeforeEach @AfterEach
    void setup(){
        //inicializa e limpa o arquivo antes de executar cada método
        studentDAO = new StudentDAO();
        TestUtilsGenerator.emptyUsersFile();
    }

    @Test
    void save_saveStudent_whenNewStudent() {

        //preparei
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();

        //executei
        StudentDTO saveStudent = studentDAO.save(newStudent);

        //validei
        assertThat(saveStudent).isNotNull();
        assertThat(saveStudent.getId().doubleValue()).isPositive();
        assertThat(saveStudent.getStudentName()).isEqualTo(newStudent.getStudentName());

    }

    @Test
    void save_update_whenStudentWithId() {

        //preparei
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO saveStudent = studentDAO.save(newStudent);
        saveStudent.setStudentName("Lucas");
        saveStudent.getSubjects().get(0).setName("Programação");

        //executei
        StudentDTO updateStudent = studentDAO.save(saveStudent);

        //validei
        //não ser nulo
        assertThat(saveStudent).isNotNull();

        //id do update ser igual ao do banco
        assertThat(updateStudent.getId()).isEqualTo(saveStudent.getId());

        //nome do estudante do update ser igual ao do banco
        assertThat(updateStudent.getStudentName()).isEqualTo(saveStudent.getStudentName());

        //nome da materia do update ser igual ao nome da materia do banco
        assertThat(updateStudent.getSubjects().get(0).getName()).isEqualTo(saveStudent.getSubjects().get(0).getName());
        assertThat(saveStudent.getStudentName()).isEqualTo(newStudent.getStudentName());

    }


    @Test
    void save_throwsException_whenStudentWithIdAndNotExist() {

        //preparei
        StudentDTO student = TestUtilsGenerator.getStudentWithId();

        //executei
        StudentNotFoundException exception = Assertions.assertThrows(StudentNotFoundException.class, ()->{
            StudentDTO saveStudent = studentDAO.save(student);
        });

        //validei a exceção lançada
        assertThat(exception.getError().getDescription().contains(student.getId().toString()));
        assertThat(exception.getStatus()).isEqualTo(HttpStatus.NOT_FOUND);



    }

    @Test
    void delete() {
        //preparei
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO saveStudent = studentDAO.save(newStudent);

        //executei
        studentDAO.delete(saveStudent.getId());

        //validei
        assertThat(studentDAO.exists(saveStudent)).isFalse();


    }

    @Test
    void exists_returnTrue_whenStudentExist() {
        //preparei
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO saveStudent = studentDAO.save(newStudent);

        //executei
        boolean exist = studentDAO.exists(saveStudent);

        //resultado esperado
        assertThat(exist).isTrue();

    }

    @Test
    void exists_returnFalse_whenStudentNotExist() {
        //preparei
        StudentDTO student = TestUtilsGenerator.getStudentWithId();


        //executei
        boolean exist = studentDAO.exists(student);

        //resultado esperado
        assertThat(exist).isFalse();

    }

    @Test
    void findById_returnStudent_whenStudentExist() {
        //preparei
        StudentDTO newStudent = TestUtilsGenerator.getNewStudentWithOneSubject();
        StudentDTO saveStudent = studentDAO.save(newStudent);

        //executei
        StudentDTO find = studentDAO.findById(saveStudent.getId());

        //validei
        assertThat(find).isNotNull().isEqualTo(newStudent);
        assertThat(find.getId()).isEqualTo(newStudent.getId());
        assertThat(find.getStudentName()).isEqualTo(newStudent.getStudentName());
    }

    @Test
    void findById_throwException_whenStudentNotExist() {
        //preparei
        StudentDTO student = TestUtilsGenerator.getStudentWithId();

        //executei
        StudentNotFoundException exception = Assertions.assertThrows(StudentNotFoundException.class, ()->{
            studentDAO.findById(student.getId());
        });

        //validei a exceção
        assertThat(exception.getError().getDescription().contains(student.getId().toString()));
        assertThat(exception.getStatus()).isEqualTo(HttpStatus.NOT_FOUND);
    }
}