package com.app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.pojos.Batch;
import com.app.core.service.IBatchService;

@RestController
@RequestMapping("/batches")
public class BatchController {
	
	@Autowired
	private IBatchService batchService;
	
	public BatchController() {
		// TODO Auto-generated constructor stub
		System.out.println("In ctor of "+getClass());
	}
	
	@GetMapping
	public List<Batch> getAllBatches(){
		System.out.println("in get all batches");
		return batchService.getAllBatches();
	}
	
	@PostMapping("/add")
	public Batch addBatch(@RequestBody Batch batch) {
		System.out.println("In add batch "+batch);
		return batchService.addNewBatch(batch);
	}
	
	@GetMapping("/{id}")
	public Batch getBatch(@PathVariable int id) {
		System.out.println("In get batch "+id);
		return batchService.getBatchDetails(id);
	}
	
	@PutMapping("/update")
	public Batch updateBatch(@RequestBody Batch batch) {
		System.out.println("in update batch "+batch);
		return batchService.updateBatch(batch);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBatch(@PathVariable int id) {
		System.out.println("in delete batch "+id);
		return batchService.deleteBatch(id);
	}
	
	

}
