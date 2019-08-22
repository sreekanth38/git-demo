package com.pawana.spring.security.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pawana.spring.security.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
