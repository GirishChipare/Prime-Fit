package com.app.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.dto.BatchDTO;
import com.app.core.pojos.Batch;
import com.app.core.service.IBatchService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/batches")
public class BatchController {
	
	@Autowired
	private IBatchService batchService;
	
	public BatchController() {
		// TODO Auto-generated constructor stub
		System.out.println("In constructor of "+getClass());
	}
	
	@GetMapping("/batch")
	public BatchDTO<?> getAllBatches(){
		System.out.println("in get all batches");
		return  new BatchDTO<>(HttpStatus.OK,"Batches Found ", batchService.getAllBatches());
	}
	
	@PostMapping("/add")
	public  BatchDTO<?> addBatch(@RequestBody Batch batch) {
		System.out.println("In add batch "+batch);
		Batch b=batchService.addNewBatch(batch);
		return new BatchDTO<>(HttpStatus.OK,"Batch added successfully", b);
	}
	
	@GetMapping("/batch/{id}")
	public ResponseEntity<?> getBatch(@PathVariable int id) {
		System.out.println("In get batch "+id);
		return  new ResponseEntity<>(batchService.getBatchDetails(id),HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public  BatchDTO<?> updateBatch(@RequestBody Batch batch) {
		System.out.println("in update batch "+batch);
		Batch b= batchService.updateBatch(batch);
		return new BatchDTO<>(HttpStatus.OK,"Batch updated successfully", b);
	}

	@DeleteMapping("/delete/{id}")
	public  BatchDTO<?> deleteBatch(@PathVariable int id) {
		System.out.println("in delete batch "+id);
		String b=batchService.deleteBatch(id);
		return new BatchDTO<>(HttpStatus.OK,"Batch deleted successfully", b);
	}
	
	

}
