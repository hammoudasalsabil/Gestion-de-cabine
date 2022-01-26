package com.doctor.doctor.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Doctor")
@DiscriminatorValue("D")
public class Doctor extends Utilisateur{

	private String matricule;
	
	@OneToMany(mappedBy = "doctor",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Patient> patients;

	

	public Doctor(String nom, String prenom, Date dateNaissance, String genre, String adresse, String phone,
			String etatCivil, String matricule) {
		super(nom, prenom, dateNaissance, genre, adresse, phone, etatCivil);
		this.matricule = matricule;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Doctor [matricule=" + matricule + ", patients=" + patients + "]";
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	
	
}
