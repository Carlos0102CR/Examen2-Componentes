package com.cenfotec.finca.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TProductores")
public class Productor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="cedula")
	private String cedula;

	@Column(name="nombre")
	private String nombre;

	@Column(name="empresa")
	private String empresa;

	@Column(name="direccion_nominal")
	private String direccionNominal;

	@Column(name="provincia")
	private String provincia;

	@Column(name="canton")
	private String canton;

	@Column(name="distrito")
	private String distrito;
	
	public Productor() {
		this.provincia = "Cartago";
	}

	public Productor(String cedula, String nombre, String empresa, String direccionNominal, String provincia,
			String canton, String distrito) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.empresa = empresa;
		this.direccionNominal = direccionNominal;
		this.provincia = provincia;
		this.canton = canton;
		this.distrito = distrito;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDireccionNominal() {
		return direccionNominal;
	}

	public void setDireccionNominal(String direccionNominal) {
		this.direccionNominal = direccionNominal;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	
	
}
