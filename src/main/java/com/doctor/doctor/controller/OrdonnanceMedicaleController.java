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

import com.doctor.doctor.dao.OrdonnanceMedicaleRepository;
import com.doctor.doctor.model.OrdonnanceMedicale;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrdonnanceMedicaleController {

	@Autowired
	private OrdonnanceMedicaleRepository ordonnancemedicalerepository;
	
	@GetMapping(value="/OrdonnanceMedicale")
	public List<OrdonnanceMedicale> AfficherOrdonnanceMedicales(){
		return ordonnancemedicalerepository.findAll();
	}
	
	@GetMapping(value="/OrdonnanceMedicale/{id}")
	public OrdonnanceMedicale AfficherOrdonnanceMedicale(@PathVariable int id){
		return ordonnancemedicalerepository.findById(id);
	}
	
	@PostMapping(value="/AddOrdonnanceMedicale")
	public OrdonnanceMedicale AddOrdonnanceMedicale(@RequestBody OrdonnanceMedicale ordonnancemedicale){
		return ordonnancemedicalerepository.save(ordonnancemedicale);
	}
	
	@DeleteMapping(value="/DelOrdonnanceMedicale/{id}")
	public OrdonnanceMedicale DelOrdonnanceMedicale(@PathVariable int id) {
		return ordonnancemedicalerepository.deleteById(id);
	} 
	
	@PutMapping(value="/UpdOrdonnanceMedicale/{id}")
	public OrdonnanceMedicale UpdOrdonnanceMedicale(@RequestBody  OrdonnanceMedicale ordonnancemedicale, @PathVariable int id){
		ordonnancemedicale.setId(id);
		return ordonnancemedicalerepository.save(ordonnancemedicale);
	}
}
