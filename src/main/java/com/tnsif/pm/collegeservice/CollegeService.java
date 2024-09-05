package com.tnsif.pm.collegeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class CollegeService {
	@Autowired
	private CollegeRepository repo;
	public List <College> listAll()
	{
		return repo.findAll();
		
	}
	public College get(Long id)
	{
		return repo.findById(id).get();
	}
	public void save(College college)
	{
		 repo.save(college);
	}
	public void delete(Long id)
	{
		
		repo.deleteById( id);
	}

}
