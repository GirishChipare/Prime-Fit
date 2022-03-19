package com.app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.core.pojos.Batch;
@Repository
public interface BatchRepository extends JpaRepository<Batch, Integer> {
	
}
