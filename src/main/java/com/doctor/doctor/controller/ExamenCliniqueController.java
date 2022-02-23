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

import com.doctor.doctor.dao.ExamenCliniqueRepository;
import com.doctor.doctor.model.ExamenClinique;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ExamenCliniqueController {

	@Autowired
	private ExamenCliniqueRepository examencliniquerepository;
	
	@GetMapping(value="/ExamenClinique")
	public List<ExamenClinique> AfficherExamenCliniques(){
		return examencliniquerepository.findAll();
	}
	
	@GetMapping(value="/ExamenClinique/{id}")
	public ExamenClinique AfficherExamenClinique(@PathVariable int id){
		return examencliniquerepository.findById(id);
	}
	
	@PostMapping(value="/AddExamenClinique")
	public ExamenClinique AddExamenClinique(@RequestBody ExamenClinique examenclinique){
		return examencliniquerepository.save(examenclinique);
	}
	
	@DeleteMapping(value="/DelExamenClinique/{id}")
	public ExamenClinique DelExamenClinique(@PathVariable int id) {
		return examencliniquerepository.deleteById(id);
	} 
	
	@PutMapping(value="/UpdExamenClinique/{id}")
	public ExamenClinique UpdExamenClinique(@RequestBody ExamenClinique examenclinique, @PathVariable int id){
		examenclinique.setId(id);
		return examencliniquerepository.save(examenclinique);
	}
}
