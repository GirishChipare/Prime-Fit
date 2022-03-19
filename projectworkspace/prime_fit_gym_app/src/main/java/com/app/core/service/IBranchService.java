package com.app.core.service;

import java.util.List;

import com.app.core.pojos.GymBranch;

public interface IBranchService {
	//get list of all branches
	List<GymBranch> getAllBranches();
	
	//add a new branch
	GymBranch addNewBranch(GymBranch branch);
	
	//update branch details
	GymBranch updateBranch(GymBranch branch);
	
	//delete branch
	String deleteBranch(int branchId);
	
	//get branch details by id
	GymBranch getBranchDetails(int branchId);
	
	

}
