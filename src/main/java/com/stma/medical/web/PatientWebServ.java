package com.stma.medical.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stma.medical.dao.PatientRepository;
import com.stma.medical.entites.Patient;

@RestController
@CrossOrigin("*")
public class PatientWebServ {
	@Autowired
	private PatientRepository patientRepository;
	
	@Secured(value= {"ROLE_ADMIN","ROLE_MANAGER"})
	@RequestMapping(value="/savePatient",method=RequestMethod.POST)
	public Patient savePatient(@RequestBody Patient p){
		return patientRepository.save(p);
	}
	
	
	@RequestMapping(value="/searchAllPatients",method=RequestMethod.GET)
	public List<Patient> searchAllPatient(){
		return patientRepository.findAll();
		
	}
	
	@Secured(value= {"ROLE_ADMIN","ROLE_MANAGER","ROLE_USER"})
	@RequestMapping(value="/searchMinorPatients",method=RequestMethod.GET)
	public List<Patient> searchMinorPatient(){
		return patientRepository.searchMinorPatient();
		
	}
	
	
}
