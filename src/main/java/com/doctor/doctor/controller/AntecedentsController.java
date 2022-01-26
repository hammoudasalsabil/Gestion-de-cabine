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

import com.doctor.doctor.dao.AntecedentsRepository;
import com.doctor.doctor.model.Antecedents;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AntecedentsController {

	@Autowired
	private AntecedentsRepository antecedentsrepository;
	
	@GetMapping(value="/Antecedents")
	public List<Antecedents> AfficherAntecedents(){
		return antecedentsrepository.findAll();
	}
	
	@GetMapping(value="/Antecedents/{id}")
	public Antecedents AfficherAntecedent(@PathVariable int id){
		return antecedentsrepository.findById(id);
	}
	
	@PostMapping(value="/AddAntecedents")
	public Antecedents AddAntecedents(@RequestBody Antecedents antecedents){
		return antecedentsrepository.save(antecedents);
	}
	
	@DeleteMapping(value="/DelAntecedents/{id}")
	public Antecedents DelAntecedents(@PathVariable int id) {
		return antecedentsrepository.deleteById(id);
	} 
	
	@PutMapping(value="/UpdAntecedents/{id}")
	public Antecedents UpdAntecedents(@RequestBody Antecedents antecedents, @PathVariable int id){
		antecedents.setId(id);
		return antecedentsrepository.save(antecedents);
	}
}
