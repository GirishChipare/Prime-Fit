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
import com.app.core.pojos.GymBranch;
import com.app.core.service.IBranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {
	
	@Autowired
	private IBranchService branchService;
	
	public BranchController() {
		// TODO Auto-generated constructor stub
	System.out.println("in ctor of "+getClass());
	}
	

	@GetMapping
	public List<GymBranch> getAllBranches(){
		System.out.println("in get all batches");
		return branchService.getAllBranches();
	}
	
	@PostMapping("/add")
	public GymBranch addBatch(@RequestBody GymBranch branch) {
		System.out.println("In add batch "+branch);
		return branchService.addNewBranch(branch);
	}
	
	@GetMapping("/{id}")
	public GymBranch getBatch(@PathVariable int id) {
		System.out.println("In get batch "+id);
		return branchService.getBranchDetails(id);
	}
	
	@PutMapping("/update")
	public GymBranch updateBatch(@RequestBody GymBranch branch) {
		System.out.println("in update batch "+branch);
		return branchService.updateBranch(branch);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBatch(@PathVariable int id) {
		System.out.println("in delete batch "+id);
		return branchService.deleteBranch(id);
	}

}
