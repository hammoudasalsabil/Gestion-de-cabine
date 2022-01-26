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
@Table(name="Secretaire")
@DiscriminatorValue("S")
public class Secretaire extends Utilisateur{
	
	private String cin;
	private String numeroContrat;
	
	@OneToMany(mappedBy = "secretaire",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Patient> patients;
	
	@OneToMany(mappedBy = "secretaire",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Rdv> rdvs;
	
	@OneToMany(mappedBy = "secretaire",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<DemandeRdv> demandeRdvs;

	public Secretaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretaire(String nom, String prenom, Date dateNaissance, String genre, String adresse, String phone,
			String etatCivil, String cin, String numeroContrat) {
		super(nom, prenom, dateNaissance, genre, adresse, phone, etatCivil);
		this.cin = cin;
		this.numeroContrat = numeroContrat;
	}

	@Override
	public String toString() {
		return "Secretaire [cin=" + cin + ", numeroContrat=" + numeroContrat + ", patients=" + patients + ", rdvs="
				+ rdvs + ", demandeRdvs=" + demandeRdvs + "]";
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNumeroContrat() {
		return numeroContrat;
	}

	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public List<Rdv> getRdvs() {
		return rdvs;
	}

	public void setRdvs(List<Rdv> rdvs) {
		this.rdvs = rdvs;
	}

	public List<DemandeRdv> getDemandeRdvs() {
		return demandeRdvs;
	}

	public void setDemandeRdvs(List<DemandeRdv> demandeRdvs) {
		this.demandeRdvs = demandeRdvs;
	}
	
	
	

}
