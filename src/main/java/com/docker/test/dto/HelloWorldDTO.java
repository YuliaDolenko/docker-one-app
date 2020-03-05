package com.docker.test.dto;

public class HelloWorldDTO {

    private int hello_id;
    private String name;

    public HelloWorldDTO(Integer hello_id, String name) {
        this.hello_id = hello_id;
        this.name = name;
    }

    public int getId() {
        return hello_id;
    }

    public void setId(int id) {
        this.hello_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
