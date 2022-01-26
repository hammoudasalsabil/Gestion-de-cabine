package com.doctor.doctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.doctor.model.Analyse;

@Repository
public interface AnalyseRepository extends JpaRepository <Analyse, Integer>{

	Analyse findById(int id);
	Analyse deleteById(int id);
}
