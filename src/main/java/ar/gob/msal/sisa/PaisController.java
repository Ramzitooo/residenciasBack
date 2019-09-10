package ar.gob.msal.sisa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.gob.msal.sisa.model.Pais;
import ar.gob.msal.sisa.repositorio.PaisRepository;

@RestController
@RequestMapping("/pais")
public class PaisController {

	@Autowired
	PaisRepository paisRepositorio;
	
	@GetMapping("/all")
	public ResponseEntity<List<Pais>> getPaises(){
		
		Iterable<Pais> source = this.paisRepositorio.findAll();
		List<Pais> target = new ArrayList<>();
		
		source.iterator().forEachRemaining(p -> target.add(p));
		return ResponseEntity.ok(target);
	}
}
