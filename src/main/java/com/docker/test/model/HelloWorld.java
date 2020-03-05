package com.docker.test.model;

import javax.persistence.*;

@Entity
@Table(name = "helloworld")
public class HelloWorld {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int hello_id;

    @Column(name = "hello")
    private String name;

    public HelloWorld() {
    }

    public HelloWorld(Long id, String name) {
    }

    public Integer getHello_id() {
        return hello_id;
    }

    public void setHello_id(int hello_id) {
        this.hello_id = hello_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
