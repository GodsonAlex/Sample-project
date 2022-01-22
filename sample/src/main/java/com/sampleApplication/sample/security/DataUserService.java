package com.sampleApplication.sample.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;


//@Service
//public class DataUserService implements UserDetailsService {
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//         UserDetails user =  User.builder().username("Abdul").password("godson").build();
//         return (UserDetails) new InMemoryUserDetailsManager(user);
//    }
//}
