package ar.gob.msal.sisa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="INSTITUCION_FORMADORA")
public class Institucion {
	
	@Id
	@Column(name="ID_INSTITUCION_FORMADORA")
	@Getter
	@Setter
	private Long id;
	
	
	@Column(name="DENOMINACION")
	@Getter
	@Setter
	private String nombre;

	
	

}
