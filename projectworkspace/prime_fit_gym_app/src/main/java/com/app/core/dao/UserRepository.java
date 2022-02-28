package com.app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.core.pojos.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
