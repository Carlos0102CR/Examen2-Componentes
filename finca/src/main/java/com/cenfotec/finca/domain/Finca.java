package com.cenfotec.finca.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TFincas")
public class Finca {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="id_productor")
	private long idProductor;

	public Finca() {
		
	}
	
	public Finca(String nombre, long idProductor) {
		super();
		this.nombre = nombre;
		this.idProductor = idProductor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getIdProductor() {
		return idProductor;
	}

	public void setIdProductor(long idProductor) {
		this.idProductor = idProductor;
	}
	
}
