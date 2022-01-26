package com.doctor.doctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.doctor.model.Antecedents;

@Repository
public interface AntecedentsRepository extends JpaRepository<Antecedents, Integer> {

	Antecedents findById(int id);
	Antecedents deleteById(int id);
}
