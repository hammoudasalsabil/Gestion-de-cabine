package com.doctor.doctor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Maladie")
public class Maladie {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String nom;
	
	@ManyToOne
    @JoinColumn(name="id_patient")
    private Patient patient;

	public Maladie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Maladie(String nom, Patient patient) {
		super();
		this.nom = nom;
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Maladie [id=" + id + ", nom=" + nom + ", patient=" + patient + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	

}
