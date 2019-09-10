package ar.gob.msal.sisa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="REFEPS_ESPECIALIDAD")
public class RefepsEspecialidades {

	@Id
	@Column(name="ID_REFEPS_ESPECIALIDAD")
	@Getter
	@Setter
	private Long id;
	
	
	@Column(name="NOMBRE")
	@Getter
	@Setter
	private String nombre;

}
