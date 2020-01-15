package com.stma.medical.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.stma.medical.entites.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{
	@Query("Select p from Patient p where p.age < 18" )
	List<Patient> searchMinorPatient();
}
