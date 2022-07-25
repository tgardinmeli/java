package com.dh.meli.tutoriais.service;

import com.dh.meli.tutoriais.exception.BadRequestException;
import com.dh.meli.tutoriais.exception.NotFoundException;
import com.dh.meli.tutoriais.mensagemDto.MensagemDto;
import com.dh.meli.tutoriais.model.Tutorial;
import com.dh.meli.tutoriais.repository.TutorialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TutorialService {
    @Autowired
    private TutorialRepo repo;

    public Tutorial getById(long id){
        return repo.findById(id).orElseThrow(()-> new NotFoundException("Tutorial não encontrado"));
    }

    public Tutorial cadastrarTutorial(Tutorial tutorial){
        if(tutorial.getId() > 0){
            throw new BadRequestException("Tutorial já cadastrado");
        }
        return repo.save(tutorial);
    }

    public List<Tutorial> getAllTutorials(){
        return (List)repo.findAll();
    }

    public MensagemDto deleteTutorial(long id){
        Tutorial tutorial = getById(id);
        repo.delete(tutorial);
        return MensagemDto.builder()
                .mensagem("Tutorial: "+ tutorial.getTitulo() + ", deletado com sucesso!")
                .build();
    }

    public MensagemDto deleteAllTutorials(){
        repo.deleteAll();
        return MensagemDto.builder()
                .mensagem("Xiii, todos os tutoriais foram deletados")
                .build();
    }

    public Tutorial updateTutorial(long id, Tutorial tutorial){
        getById(id);
        return repo.save(tutorial);
    }

    public List<Tutorial> getPublished(String situacao){
        return repo.findBySituacaoDaAplicacao(situacao);
    }

    public List<Tutorial> getFilterTitle(String title){
        return repo.findByTituloContaining(title);
    }
}
