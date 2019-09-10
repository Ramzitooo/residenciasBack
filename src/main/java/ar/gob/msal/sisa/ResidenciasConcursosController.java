package ar.gob.msal.sisa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.gob.msal.sisa.model.ResidenciasConcursos;
import ar.gob.msal.sisa.repositorio.ResidenciasConcursosRepository;

@RestController
@RequestMapping("/residencias")
public class ResidenciasConcursosController{

	@Autowired
	ResidenciasConcursosRepository residenciasConcursosRepository;
	
	@GetMapping("/all")
	public ResponseEntity<List<ResidenciasConcursos>> getResidencias(){
		
		Iterable<ResidenciasConcursos> source = this.residenciasConcursosRepository.findAll();
		List<ResidenciasConcursos> target = new ArrayList<>();
		
		source.iterator().forEachRemaining(p -> target.add(p));
		return ResponseEntity.ok(target);
	}
}
