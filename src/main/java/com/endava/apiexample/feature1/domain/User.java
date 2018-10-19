package com.endava.apiexample.feature1.domain;

import lombok.Data;
import lombok.Generated;
import lombok.experimental.Accessors;

import javax.persistence.*;


@Table(name = "users")
@Entity
@Data
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
}
