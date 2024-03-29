package com.sampleApplication.sample.repository;

import com.sampleApplication.sample.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<MyUser, Long> {

    Optional<MyUser> findByUserName(String login);
}
