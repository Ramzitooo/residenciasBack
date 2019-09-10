package ar.gob.msal.sisa;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.gob.msal.sisa.model.Institucion;
import ar.gob.msal.sisa.repositorio.InstitucionRepository;


@RestController
@RequestMapping("/institucion")
public class InstutucionController {

	@Autowired
	InstitucionRepository institucionRepository;

	@GetMapping("/all")
	public ResponseEntity<List<Institucion>> getInstituciones() {

		Iterable<Institucion> source = this.institucionRepository.findAll();
		List<Institucion> target = new ArrayList<>();

		
	
		source.iterator().forEachRemaining(p -> target.add(p));

		return ResponseEntity.ok(target); 

	}
	
}
