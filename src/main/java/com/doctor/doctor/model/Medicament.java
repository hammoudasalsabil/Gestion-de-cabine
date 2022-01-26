package com.doctor.doctor.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Medicament")
public class Medicament {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String code;
	private String nom;
	
	@ManyToMany
	private Set<OrdonnanceMedicale> ordonnances;

	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicament(String code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Medicament [id=" + id + ", code=" + code + ", nom=" + nom + ", ordonnances=" + ordonnances + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<OrdonnanceMedicale> getOrdonnances() {
		return ordonnances;
	}

	public void setOrdonnances(Set<OrdonnanceMedicale> ordonnances) {
		this.ordonnances = ordonnances;
	}
	
	
}
