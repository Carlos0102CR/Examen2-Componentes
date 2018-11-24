package com.cenfotec.finca.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TCafes")
public class Cafe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="id_finca")
	private Long idFinca;

	@Column(name="tipo")
	private String tipo;

	
	public Cafe() {
	}


	public Cafe(Long idFinca, String tipo) {
		this.idFinca = idFinca;
		this.tipo = tipo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getIdFinca() {
		return idFinca;
	}


	public void setIdFinca(Long idFinca) {
		this.idFinca = idFinca;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
