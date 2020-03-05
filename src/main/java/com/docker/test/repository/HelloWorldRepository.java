package com.docker.test.repository;

import com.docker.test.model.HelloWorld;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HelloWorldRepository extends CrudRepository<HelloWorld, Integer> {

    HelloWorld findById(int id);
}
