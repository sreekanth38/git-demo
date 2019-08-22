package com.pawana.spring.security.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pawana.spring.security.api.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
