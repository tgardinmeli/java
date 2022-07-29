package com.dh.meli.integradora_spring_elastic.service;


import com.dh.meli.integradora_spring_elastic.exception.BadRequestException;
import com.dh.meli.integradora_spring_elastic.exception.NotFoundException;
import com.dh.meli.integradora_spring_elastic.model.Employee;
import com.dh.meli.integradora_spring_elastic.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepo repo;


    @Override
    public Employee saveEmployee(Employee employee) {
        return repo.save(employee);
    }

    @Override
    public Employee getById(String id) {
        return repo.findById(id).orElseThrow(()-> new NotFoundException("Funcionário não encontrado!"));
    }

    @Override
    public List<Employee> getAll() {
        return repo.getAll();
    }
}
