package ar.gob.msal.sisa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="ESTADO_CIVIL")
public class EstadoCivil {

	@Id
	@Column(name="ID_ESTADO_CIVIL")
	@Getter
	@Setter
	private long id;

	@Column(name="NOMBRE")
	@Getter
	@Setter
	private String nombre;

	//@Column(name="HABILITADO")
	//@Getter
	//@Setter
	//private boolean habilitado;
	
}
