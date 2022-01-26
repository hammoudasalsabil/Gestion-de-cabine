package com.doctor.doctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.doctor.model.Maladie;

@Repository
public interface MaladieRepository extends JpaRepository<Maladie, Integer> {

	Maladie findById(int id);
	Maladie deleteById(int id);
}
