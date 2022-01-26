package com.doctor.doctor.model;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="DemandeRdv")
public class DemandeRdv {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private Date date;
	private Time heure;
	private String preferences;
	@ManyToOne
    @JoinColumn(name="id_patient")
    private Patient patient;
	
	@ManyToOne
    @JoinColumn(name="id_secretaire")
    private Secretaire secretaire;

	public DemandeRdv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemandeRdv(Date date, Time heure, String preferences, Patient patient, Secretaire secretaire) {
		super();
		this.date = date;
		this.heure = heure;
		this.preferences = preferences;
		this.patient = patient;
		this.secretaire = secretaire;
	}

	@Override
	public String toString() {
		return "DemandeRdv [id=" + id + ", date=" + date + ", heure=" + heure + ", preferences=" + preferences
				+ ", patient=" + patient + ", secretaire=" + secretaire + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getHeure() {
		return heure;
	}

	public void setHeure(Time heure) {
		this.heure = heure;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Secretaire getSecretaire() {
		return secretaire;
	}

	public void setSecretaire(Secretaire secretaire) {
		this.secretaire = secretaire;
	}
	
	

}
