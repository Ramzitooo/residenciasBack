package ar.gob.msal.sisa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.gob.msal.sisa.repositorio.RefepsEspecialidadesRepositorio;
import ar.gob.msal.sisa.model.RefepsEspecialidades;

@RestController
@RequestMapping("/refeps/especialidades")

public class RefepsEspecialidadesController {

	@Autowired
	RefepsEspecialidadesRepositorio refepsEspecialidadesrepositorio;
	
	@GetMapping("/all")
	public ResponseEntity<List<RefepsEspecialidades>> getRefepsEspecialidaes(){
		
		Iterable<RefepsEspecialidades> source = this.refepsEspecialidadesrepositorio.findAll();
		List<RefepsEspecialidades> target = new ArrayList<>();

		
	
		source.iterator().forEachRemaining(p -> target.add(p));

		return ResponseEntity.ok(target); 
	}
	
}
