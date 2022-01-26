package com.doctor.doctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.doctor.model.Rdv;

@Repository
public interface RdvRepository extends JpaRepository<Rdv, Integer> {
	
	Rdv findById(int id);
	Rdv deleteById(int id);

}
