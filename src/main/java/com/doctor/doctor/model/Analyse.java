package com.doctor.doctor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Analyse")
public class Analyse {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private Date date;
	private String type;
	private String resultat;
	
	@ManyToOne
    @JoinColumn(name="id_Rdv")
    private Rdv rdv;

	public Analyse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Analyse(Date date, String type, String resultat, Rdv rdv) {
		super();
		this.date = date;
		this.type = type;
		this.resultat = resultat;
		this.rdv = rdv;
	}

	@Override
	public String toString() {
		return "Analyse [id=" + id + ", date=" + date + ", type=" + type + ", resultat=" + resultat + ", rdv=" + rdv
				+ "]";
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public Rdv getRdv() {
		return rdv;
	}

	public void setRdv(Rdv rdv) {
		this.rdv = rdv;
	}

	
}
