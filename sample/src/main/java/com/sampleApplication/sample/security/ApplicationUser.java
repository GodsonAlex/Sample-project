package com.sampleApplication.sample.security;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class ApplicationUser extends User {

    private String role;


    public ApplicationUser(String username, String password, Collection<? extends GrantedAuthority> authorities,String role) {
        super(username, password, authorities);
        this.role = role;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
