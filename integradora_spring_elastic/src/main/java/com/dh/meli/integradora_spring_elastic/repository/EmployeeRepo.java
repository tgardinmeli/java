package com.dh.meli.integradora_spring_elastic.repository;

import com.dh.meli.integradora_spring_elastic.model.Employee;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EmployeeRepo extends ElasticsearchRepository <Employee, String>{
    @Query("{\"match_all\": {} }")
    List<Employee> getAll();
}
