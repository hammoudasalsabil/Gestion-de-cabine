package com.doctor.doctor.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.doctor.doctor.dao.UtilisateurRepository;
import com.doctor.doctor.model.Doctor;
import com.doctor.doctor.model.Patient;
import com.doctor.doctor.model.Secretaire;
import com.doctor.doctor.model.Utilisateur;

import io.swagger.annotations.Api;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Api(description = "gestion des Utilisateu")

public class UtilisateurController {

	@Autowired
	private UtilisateurRepository utilisateurrepository;
	
	@GetMapping(value="/Utilisateur")
	public List<Utilisateur> AfficherUtilisateurs(){
		return utilisateurrepository.findAll();
	}
	
	@GetMapping(value="/Utilisateur/{id}")
	public Utilisateur AfficherUtilisateur(@PathVariable int id){
		return utilisateurrepository.findById(id);
	}
	
	@GetMapping(value="/Utilisateur/{type_per}")
	public List<Utilisateur> AffUser(@PathVariable String type_per){
		return utilisateurrepository.ChercherPatient(type_per);
	}
	
	@PostMapping(value="/AddDoctor")
	public Utilisateur AddDoctor(@RequestBody Doctor doctor){
		return utilisateurrepository.save(doctor);
	}
	
	@PostMapping(value="/AddSecretaire")
	public Utilisateur AddSecretaire(@RequestBody Secretaire secretaire){
		return utilisateurrepository.save(secretaire);
	}
	
	@PostMapping(value="/AddPatient")
	public Utilisateur AddPatient(@RequestBody Patient patient){
		return utilisateurrepository.save(patient);
	}
	
	@DeleteMapping(value="/DelUtilisateur/{id}")
	public Utilisateur DelUtilisateur(@PathVariable int id) {
		return utilisateurrepository.deleteById(id);
	} 
	
	@PutMapping(value="/UpdDoctor/{id}")
	public Utilisateur UpdDoctor(@RequestBody  Doctor doctor, @PathVariable int id){
		doctor.setId(id);
		return utilisateurrepository.save(doctor);
	}
	
	@PutMapping(value="/UpdSecretaire/{id}")
	public Utilisateur UpdSecretaire(@RequestBody  Secretaire secretaire, @PathVariable int id){
		secretaire.setId(id);
		return utilisateurrepository.save(secretaire);
	}
	
	@PutMapping(value="/UpdPatient/{id}")
	public Utilisateur UpdPatient(@RequestBody  Patient patient, @PathVariable int id){
		patient.setId(id);
		return utilisateurrepository.save(patient);
	}
	
}
