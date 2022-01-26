package com.doctor.doctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.doctor.model.Medicament;

@Repository
public interface MedicamentRepository extends JpaRepository<Medicament, Integer> {

	Medicament findById(int id);
	Medicament deleteById(int id);
}
