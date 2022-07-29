package com.dh.meli.integradora_spring_elastic.service;

import com.dh.meli.integradora_spring_elastic.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee saveEmployee(Employee employee);
    Employee getById(String id);
    List<Employee> getAll();
}
