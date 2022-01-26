package com.doctor.doctor.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.doctor.doctor.model.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
	
	Utilisateur findById(int id);
	Utilisateur deleteById(int id);
	

	@Query("select u from Utilisateur u where u.type_per = :type_per")
	List<Utilisateur> ChercherPatient(@Param("type_per") String type_per);

}
