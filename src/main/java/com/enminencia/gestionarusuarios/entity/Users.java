package com.enminencia.gestionusuarios.entity;

import jakarta.persistence.column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistece.Table;
import lombok.Data;

@Data 
@Entity // no crea un bean 
@table(name = "users")
public  class Users {
    @Id // Primary Key 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO INCREMENTAL
    @Column(name = "id")
    private Long id;

    @column(name = "username")
    private String username;

    @column(name = "age")
    private Long age;

    @column(name = "email")
    private  String email;

}