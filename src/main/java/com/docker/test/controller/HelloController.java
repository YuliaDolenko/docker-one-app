package com.docker.test.controller;

import com.docker.test.dto.HelloWorldDTO;
import com.docker.test.model.HelloWorld;
import com.docker.test.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("")
public class HelloController {

    private final HelloWorldRepository helloWorldRepository;

    @Autowired
    public HelloController(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    @GetMapping("/{id}")
    public HelloWorldDTO home(@PathVariable int id) {
        HelloWorld helloWorld = helloWorldRepository.findById(id);
        return new HelloWorldDTO(helloWorld.getHello_id(), helloWorld.getName());
    }

//    @GetMapping("/hello")
//    public String home() {
//        return "Hello World REST";
//    }
}
