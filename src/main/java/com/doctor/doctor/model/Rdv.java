package com.doctor.doctor.model;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Rdv")
public class Rdv {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private Date date;
	private Time heure;
	private String consultation;
	
	@ManyToOne
    @JoinColumn(name="id_secretaire")
    private Secretaire secretaire;

	@ManyToOne
    @JoinColumn(name="id_patient")
    private Patient patient;
	
	@OneToMany(mappedBy = "rdv",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<OrdonnanceMedicale> ordonnances;
	
	@OneToMany(mappedBy = "rdv",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ExamenClinique> examenCliniques;
	

	@OneToMany(mappedBy = "rdv",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Analyse> analyses;


	public Rdv() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Rdv(Date date, Time heure, String consultation, Secretaire secretaire, Patient patient) {
		super();
		this.date = date;
		this.heure = heure;
		this.consultation = consultation;
		this.secretaire = secretaire;
		this.patient = patient;
	}


	@Override
	public String toString() {
		return "Rdv [id=" + id + ", date=" + date + ", heure=" + heure + ", consultation=" + consultation
				+ ", secretaire=" + secretaire + ", patient=" + patient + ", ordonnances=" + ordonnances
				+ ", examenCliniques=" + examenCliniques + ", analyses=" + analyses + "]";
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


	public String getConsultation() {
		return consultation;
	}


	public void setConsultation(String consultation) {
		this.consultation = consultation;
	}


	public Secretaire getSecretaire() {
		return secretaire;
	}


	public void setSecretaire(Secretaire secretaire) {
		this.secretaire = secretaire;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public List<OrdonnanceMedicale> getOrdonnances() {
		return ordonnances;
	}


	public void setOrdonnances(List<OrdonnanceMedicale> ordonnances) {
		this.ordonnances = ordonnances;
	}


	public List<ExamenClinique> getExamenCliniques() {
		return examenCliniques;
	}


	public void setExamenCliniques(List<ExamenClinique> examenCliniques) {
		this.examenCliniques = examenCliniques;
	}


	public List<Analyse> getAnalyses() {
		return analyses;
	}


	public void setAnalyses(List<Analyse> analyses) {
		this.analyses = analyses;
	}
	
	

}
