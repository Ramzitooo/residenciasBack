package ar.gob.msal.sisa.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity(name="RES_PREINSCRIPCION")
public class ResidenciasConcursos {

	@Id
	@Column(name="ID_RES_PREINSCRIPCION")
	@Getter
	@Setter
	private String idPreinscripcion;
	
	@Column(name="NOMBRE")
	@Getter
	@Setter
	private String nombre;
	
	@Column(name="DESCRIPCION")
	@Getter
	@Setter
	private String descripcion;
	
	@Column(name="COMENTARIO")
	@Getter
	@Setter
	private String comentario;

	@Column(name="ID_TIPO_CONCURSO")
	@Getter
	@Setter
	private String idTipoConcurso;
	
	@Column(name="ID_SUB_TIPO_CONCURSO")
	@Getter
	@Setter
	private String idSubTipoConcurso;


}
