package com.doctor.doctor;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctor.doctor.dao.UtilisateurRepository;
import com.doctor.doctor.model.Doctor;
import com.doctor.doctor.model.Utilisateur;

import springfox.documentation.swagger2.annotations.EnableSwagger2;




@SpringBootApplication
@EnableSwagger2
public class DoctorApplication implements CommandLineRunner{

	@Autowired
	private UtilisateurRepository utilisateurrepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Utilisateur us1=utilisateurrepository.save(new Doctor("Hammouda", "Salsabil", new Date(), "Femme", "Mednine", "95888666", "Single", "Dr.005"));
		//Utilisateur us2=utilisateurrepository.save(new Doctor("Hsin", "Jamila", new Date(), "Femme", "Mednine", "95123654", "Single", "Dr.006"));
		
	}

}
