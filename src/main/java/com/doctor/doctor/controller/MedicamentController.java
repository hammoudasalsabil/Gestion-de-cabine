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

import com.doctor.doctor.dao.MedicamentRepository;
import com.doctor.doctor.model.Medicament;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MedicamentController {

	@Autowired
	private MedicamentRepository medicamentrepository;
	
	@GetMapping(value="/Medicament")
	public List<Medicament> AfficherMedicament(){
		return medicamentrepository.findAll();
	}
	
	@GetMapping(value="/Medicament/{id}")
	public Medicament AfficherMedicament(@PathVariable int id){
		return medicamentrepository.findById(id);
	}
	
	@PostMapping(value="/AddMedicament")
	public Medicament AddMedicament(@RequestBody Medicament medicament){
		return medicamentrepository.save(medicament);
	}
	
	@DeleteMapping(value="/DelMedicament/{id}")
	public Medicament DelMedicament(@PathVariable int id) {
		return medicamentrepository.deleteById(id);
	} 
	
	@PutMapping(value="/UpdMedicament/{id}")
	public Medicament UpdMedicament(@RequestBody Medicament medicament, @PathVariable int id){
		medicament.setId(id);
		return medicamentrepository.save(medicament);
	}
}
