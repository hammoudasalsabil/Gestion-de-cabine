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

import com.doctor.doctor.dao.DemandeRdvRepository;
import com.doctor.doctor.model.DemandeRdv;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DemandeRdvController {

	@Autowired
	private DemandeRdvRepository demanderdvrepository;
	
	@GetMapping(value="/DemandeRdv")
	public List<DemandeRdv> AfficherDemandeRdvs(){
		return demanderdvrepository.findAll();
	}
	
	@GetMapping(value="/DemandeRdv/{id}")
	public DemandeRdv AfficherDemandeRdv(@PathVariable int id){
		return demanderdvrepository.findById(id);
	}
	
	@PostMapping(value="/AddDemandeRdv")
	public DemandeRdv AddDemandeRdv(@RequestBody DemandeRdv demanderdv){
		return demanderdvrepository.save(demanderdv);
	}
	
	@DeleteMapping(value="/DelDemandeRdv/{id}")
	public DemandeRdv DelDemandeRdv(@PathVariable int id) {
		return demanderdvrepository.deleteById(id);
	} 
	
	@PutMapping(value="/UpdDemandeRdv/{id}")
	public DemandeRdv UpdDemandeRdv(@RequestBody DemandeRdv demanderdv, @PathVariable int id){
		demanderdv.setId(id);
		return demanderdvrepository.save(demanderdv);
	}
}
