package com.tnsif.pm.collegeservice;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class College {
	private Long id;
	private String name;
	private String address;
	private String accreditation;
	private LocalDate establisheddate;
	//empty constructor
	public College()
	{
		
	}
	// parameterized constructor
	public College(Long id, String name, String address, String accreditation, LocalDate establisheddate)
	{
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.accreditation = accreditation;
		this.establisheddate = establisheddate;
	}
	//getter setter
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccreditation() {
		return accreditation;
	}
	public void setAccreditation(String accreditation) {
		this.accreditation = accreditation;
	}
	public LocalDate getEstablisheddate() {
		
		return establisheddate;
	}
	public void setEstablisheddate(LocalDate establisheddate) {
		this.establisheddate = establisheddate;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
