package com.doctor.doctor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Antecedents")
public class Antecedents {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String type;
	private String valeur;
	
	@ManyToOne
    @JoinColumn(name="id_patient")
    private Patient patient;

	public Antecedents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Antecedents(String type, String valeur, Patient patient) {
		super();
		this.type = type;
		this.valeur = valeur;
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Antecedents [id=" + id + ", type=" + type + ", valeur=" + valeur + ", patient=" + patient + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
