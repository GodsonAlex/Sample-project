package com.sampleApplication.sample.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="user")
public class MyUser {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "role_id")
    private Long roleId;
    @Column(name = "username")
    private String userName;
    @Column(name="password")
    private String password;




}
