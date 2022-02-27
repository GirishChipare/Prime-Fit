package com.app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.core.pojos.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
