package com.app.core.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.core.pojos.Role;
import com.app.core.pojos.UserRole;
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByUserRole(UserRole role);
}
