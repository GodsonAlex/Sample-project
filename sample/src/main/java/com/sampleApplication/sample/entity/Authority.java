package com.sampleApplication.sample.entity;


import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;


@Data
@Entity
@Table(name = "authority")
public class Authority {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "role_id")
    private Long roleId;
    @Column(name = "auth_name")
    private String authorityName;

}
