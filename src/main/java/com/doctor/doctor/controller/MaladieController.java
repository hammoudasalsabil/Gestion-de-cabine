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

import com.doctor.doctor.dao.MaladieRepository;
import com.doctor.doctor.model.Maladie;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MaladieController {

	@Autowired
	private MaladieRepository maladierepository;
	
	@GetMapping(value="/Maladie")
	public List<Maladie> AfficherMaladies(){
		return maladierepository.findAll();
	}
	
	@GetMapping(value="/Maladie/{id}")
	public Maladie AfficherMaladie(@PathVariable int id){
		return maladierepository.findById(id);
	}
	
	@PostMapping(value="/AddMaladie")
	public Maladie AddMaladie(@RequestBody Maladie maladie){
		return maladierepository.save(maladie);
	}
	
	@DeleteMapping(value="/DelMaladie/{id}")
	public Maladie DelMaladie(@PathVariable int id) {
		return maladierepository.deleteById(id);
	} 
	
	@PutMapping(value="/UpdMaladie/{id}")
	public Maladie UpdMaladie(@RequestBody Maladie maladie, @PathVariable int id){
		maladie.setId(id);
		return maladierepository.save(maladie);
	}
}
