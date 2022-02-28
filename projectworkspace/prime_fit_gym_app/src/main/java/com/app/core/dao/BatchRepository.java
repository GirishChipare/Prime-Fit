package com.app.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.core.pojos.Batch;

public interface BatchRepository extends JpaRepository<Batch, Integer> {

}
