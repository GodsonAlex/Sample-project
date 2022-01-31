package com.sampleApplication.sample.entity;

import lombok.Data;
import lombok.Value;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "role_name")
    private String roleName;
}
