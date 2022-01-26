package com.doctor.doctor.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Patient")
@DiscriminatorValue("P")
public class Patient extends Utilisateur{

	private String code;
	
	@ManyToOne
    @JoinColumn(name="id_doctor")
    private Doctor doctor;

	@ManyToOne
    @JoinColumn(name="id_secretaire")
    private Secretaire secretaire;
	
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Maladie> maladies;
	
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Antecedents> antecedents;
	
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DemandeRdv> demandeRdvs;
	
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Rdv> rdvs;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(String nom, String prenom, Date dateNaissance, String genre, String adresse, String phone,
			String etatCivil, String code, Doctor doctor, Secretaire secretaire) {
		super(nom, prenom, dateNaissance, genre, adresse, phone, etatCivil);
		this.code = code;
		this.doctor = doctor;
		this.secretaire = secretaire;
	}

	@Override
	public String toString() {
		return "Patient [code=" + code + ", doctor=" + doctor + ", secretaire=" + secretaire + ", maladies=" + maladies
				+ ", antecedents=" + antecedents + ", demandeRdvs=" + demandeRdvs + ", rdvs=" + rdvs + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Secretaire getSecretaire() {
		return secretaire;
	}

	public void setSecretaire(Secretaire secretaire) {
		this.secretaire = secretaire;
	}

	public List<Maladie> getMaladies() {
		return maladies;
	}

	public void setMaladies(List<Maladie> maladies) {
		this.maladies = maladies;
	}

	public List<Antecedents> getAntecedents() {
		return antecedents;
	}

	public void setAntecedents(List<Antecedents> antecedents) {
		this.antecedents = antecedents;
	}

	public List<DemandeRdv> getDemandeRdvs() {
		return demandeRdvs;
	}

	public void setDemandeRdvs(List<DemandeRdv> demandeRdvs) {
		this.demandeRdvs = demandeRdvs;
	}

	public List<Rdv> getRdvs() {
		return rdvs;
	}

	public void setRdvs(List<Rdv> rdvs) {
		this.rdvs = rdvs;
	}
	
	
}
