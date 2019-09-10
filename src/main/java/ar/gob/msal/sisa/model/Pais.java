package ar.gob.msal.sisa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="PAIS")
public class Pais {

	@Id
	@Column(name="ID_PAIS")
	@Getter
	@Setter
	private Long id;
	
	@Column(name="NOMBRE")
	@Getter
	@Setter
	private String nombre;
	
	@Column(name="NACIONALIDAD")
	@Getter
	@Setter
	private String nacionalidad;

//	@Column(name="HABILITADO")
//	@Getter
//	@Setter
//	private Boolean habilitado;
	
}
