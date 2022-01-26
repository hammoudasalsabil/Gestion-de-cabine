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

import com.doctor.doctor.dao.AnalyseRepository;
import com.doctor.doctor.model.Analyse;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AnalyseController {

	@Autowired
	private AnalyseRepository analyserepository;
	
	@GetMapping(value="/Analyse")
	public List<Analyse> AfficherAnalyses(){
		return analyserepository.findAll();
	}
	
	@GetMapping(value="/Analyse/{id}")
	public Analyse AfficherAnalyse(@PathVariable int id){
		return analyserepository.findById(id);
	}
	
	@PostMapping(value="/AddAnalyse")
	public Analyse AddAnalyse(@RequestBody Analyse analyse){
		return analyserepository.save(analyse);
	}
	
	@DeleteMapping(value="/DelAnalyse/{id}")
	public Analyse DelAnalyse(@PathVariable int id) {
		return analyserepository.deleteById(id);
	} 
	
	@PutMapping(value="/UpdAnalyse/{id}")
	public Analyse UpdAnalyse(@RequestBody  Analyse analyse, @PathVariable int id){
		analyse.setId(id);
		return analyserepository.save(analyse);
	}
}
