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

import com.doctor.doctor.dao.RdvRepository;
import com.doctor.doctor.model.Rdv;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RdvController {

	@Autowired
	private RdvRepository rdvrepository;
	
	@GetMapping(value="/Rdv")
	public List<Rdv> AfficherRdvs(){
		return rdvrepository.findAll();
	}
	
	@GetMapping(value="/Rdv/{id}")
	public Rdv AfficherRdv(@PathVariable int id){
		return rdvrepository.findById(id);
	}
	
	@PostMapping(value="/AddRdv")
	public Rdv AddRdv(@RequestBody Rdv rdv){
		return rdvrepository.save(rdv);
	}
	
	@DeleteMapping(value="/DelRdv/{id}")
	public Rdv DelRdv(@PathVariable int id) {
		return rdvrepository.deleteById(id);
	} 
	
	@PutMapping(value="/UpdRdv/{id}")
	public Rdv UpdRdv(@RequestBody  Rdv rdv, @PathVariable int id){
		rdv.setId(id);
		return rdvrepository.save(rdv);
	}
}
