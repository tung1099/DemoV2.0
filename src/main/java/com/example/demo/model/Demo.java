package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "demo")
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
