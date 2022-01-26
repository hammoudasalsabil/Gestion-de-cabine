package com.doctor.doctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.doctor.model.ExamenClinique;

@Repository
public interface ExamenCliniqueRepository extends JpaRepository<ExamenClinique, Integer> {

	ExamenClinique findById(int id);
	ExamenClinique deleteById(int id);
}
