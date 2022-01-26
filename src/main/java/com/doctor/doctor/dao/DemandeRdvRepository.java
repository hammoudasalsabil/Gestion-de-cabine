package com.doctor.doctor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctor.doctor.model.DemandeRdv;

@Repository
public interface DemandeRdvRepository extends JpaRepository<DemandeRdv, Integer> {

	DemandeRdv findById(int id);
	DemandeRdv deleteById(int id);
}
