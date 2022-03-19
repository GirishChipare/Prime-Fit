package com.app.core.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.core.dao.BatchRepository;
import com.app.core.pojos.Batch;

public class BatchServiceImpl implements IBatchService {
	
	@Autowired
	private BatchRepository batchRepo;
	

	@Override
	public List<Batch> getAllBatches() {
		// TODO Auto-generated method stub
		return batchRepo.findAll();
	}

	@Override
	public Batch addNewBatch(Batch batch) {
		// TODO Auto-generated method stub
		return batchRepo.save(batch);
	}

	@Override
	public Batch updateBatch(Batch batch) {
		// TODO Auto-generated method stub
		return batchRepo.save(batch);
		
	}

	@Override
	public String deleteBatch(int batchId) {
		// TODO Auto-generated method stub
		return "Batch with Id "+batchId+" deleted successfully";
	}

	@Override
	public Batch getBatchDetails(int batchId) {
		// TODO Auto-generated method stub
		return batchRepo.findById(batchId)
				.orElseThrow(()-> new NoSuchElementException("Batch with id "+batchId+ "not found"));
	}

}
