package com.sampleApplication.sample.security;

import com.sampleApplication.sample.entity.Authority;
import com.sampleApplication.sample.entity.MyUser;
import com.sampleApplication.sample.repository.AuthorityRepository;
import com.sampleApplication.sample.repository.RoleRepository;
import com.sampleApplication.sample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class DataUserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private AuthorityRepository authorityRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<MyUser> myUser = userRepository.findByUserName(login);
        return myUser.map(user->{
            List<Authority> authorityList = authorityRepository.findByRoleId(user.getRoleId());
            String roleName = roleRepository.findById(user.getRoleId()).get().getRoleName();
            List<GrantedAuthority> grantedAuthorityList = authorityList.stream().map(authority ->new SimpleGrantedAuthority(authority.getAuthorityName())).collect(Collectors.toList());
            UserDetails userDetails = new ApplicationUser(login, user.getPassword(),grantedAuthorityList,roleName);
            return userDetails;
        }).orElseThrow(()->new UsernameNotFoundException("Users not found"));
    }

}
