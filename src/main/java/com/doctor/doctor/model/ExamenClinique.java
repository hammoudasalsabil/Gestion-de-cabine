package com.doctor.doctor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ExamenClinique")
public class ExamenClinique {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String description;
	private String certeficat;
	
	@ManyToOne
    @JoinColumn(name="id_rdv")
    private Rdv rdv;

	public ExamenClinique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExamenClinique(String description, String certeficat, Rdv rdv) {
		super();
		this.description = description;
		this.certeficat = certeficat;
		this.rdv = rdv;
	}

	@Override
	public String toString() {
		return "ExamenClinique [id=" + id + ", description=" + description + ", certeficat=" + certeficat + ", rdv="
				+ rdv + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCerteficat() {
		return certeficat;
	}

	public void setCerteficat(String certeficat) {
		this.certeficat = certeficat;
	}

	public Rdv getRdv() {
		return rdv;
	}

	public void setRdv(Rdv rdv) {
		this.rdv = rdv;
	}
	
	
}
