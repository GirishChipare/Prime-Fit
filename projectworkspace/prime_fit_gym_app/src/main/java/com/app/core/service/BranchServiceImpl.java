package com.app.core.service;

import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.core.dao.GymBranchRepository;
import com.app.core.pojos.GymBranch;

@Service
@Transactional
public class BranchServiceImpl implements IBranchService{
	
	@Autowired
	private GymBranchRepository branchRepo;

	@Override
	public List<GymBranch> getAllBranches() {
		// TODO Auto-generated method stub
		return branchRepo.findAll();
	}

	@Override
	public GymBranch addNewBranch(GymBranch branch) {
		// TODO Auto-generated method stub
		return branchRepo.save(branch);
	}

	@Override
	public GymBranch updateBranch(GymBranch branch) {
		// TODO Auto-generated method stub
		return branchRepo.save(branch);
	}

	@Override
	public String deleteBranch(int branchId) {
		// TODO Auto-generated method stub
		branchRepo.deleteById(branchId);
		return "Branch with Id "+branchId+" deleted successfully";
	}

	@Override
	public GymBranch getBranchDetails(int branchId) {
		// TODO Auto-generated method stub
		return branchRepo.findById(branchId)
				.orElseThrow(()->new NoSuchElementException("Branch by Id "+branchId+" not found"));
	}

}
