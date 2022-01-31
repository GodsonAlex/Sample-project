package com.sampleApplication.sample.repository;

import com.sampleApplication.sample.entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    List<Authority> findByRoleId(Long roleId);
}
