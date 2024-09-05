package com.tnsif.pm.collegeservice;

import java.util.List;

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

@CrossOrigin(origins="http://localhost:3000")
@RestController


public class CollegeController {
	@Autowired
	private CollegeService service;
	@GetMapping ("/College")
	public List<College>list()
	{
		return service.listAll();
	}
	//we retrieve by ID
	@GetMapping("/College/{id}")
	public ResponseEntity<College> get(@PathVariable Long id)
	{
		try
		{
			College college = service.get(id);
			return new ResponseEntity<College>(college,HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
		}
	}
	//create
	@PostMapping("/College")
	public void add (@RequestBody College college)
	{
		service.save(college);
	}
	//update
	@PutMapping("/College/{id}")
	public ResponseEntity<?> update(@RequestBody College college, @PathVariable Long id) {
	    try {
	        // Fetch the existing college by ID
	        College existingCollege = service.get(id);
	        
	        // Set the ID of the incoming college object to ensure the update occurs on the existing record
	        college.setId(existingCollege.getId());
	        
	        // Save the updated college object
	        service.save(college);
	        
	        return new ResponseEntity<College>(college, HttpStatus.OK);
	    } catch (Exception e) {
	        return new ResponseEntity<College>(HttpStatus.NOT_FOUND);
	    }
	}

	
	//Delete opeartion
	@DeleteMapping("/College/{id}")
	public void delete (@PathVariable Long id)
	{
		service.delete(id);
	}


}
