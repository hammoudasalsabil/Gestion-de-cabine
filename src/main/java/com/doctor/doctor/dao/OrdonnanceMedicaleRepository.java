package com.doctor.doctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.doctor.model.OrdonnanceMedicale;

@Repository
public interface OrdonnanceMedicaleRepository extends JpaRepository<OrdonnanceMedicale, Integer> {

	OrdonnanceMedicale findById(int id);
	OrdonnanceMedicale deleteById(int id);
}
