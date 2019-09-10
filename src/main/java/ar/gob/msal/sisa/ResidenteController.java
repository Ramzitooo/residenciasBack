package ar.gob.msal.sisa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.mail.internet.MimeMessage;

import ar.gob.msal.sisa.model.Residente;
import ar.gob.msal.sisa.repositorio.ResidenteRepository;
import ar.gob.msal.sisa.service.NotificacionService;

@RestController
@RequestMapping("/residentes")
public class ResidenteController {

	@Autowired
	ResidenteRepository residenterepositorio;
	
	@Autowired
	private JavaMailSender sender; 
	
	@GetMapping("/all")
	public ResponseEntity<List<Residente>> getResidentes(){
		
		Iterable<Residente> source = this.residenterepositorio.findAll();
		List<Residente> target = new ArrayList<>();
		
		source.iterator().forEachRemaining(p -> target.add(p));
		return ResponseEntity.ok(target);
	}
	
	@RequestMapping(value="user", method = RequestMethod.GET)
	public @ResponseBody String getitem(@RequestParam("data") String itemid)
	{

	    return "holarsss" + itemid;
	}
	
	@RequestMapping("/mail")
    public @ResponseBody String home() 
	{
        try {
            sendEmail();
            return "Email Sent!";
        }catch(Exception ex) {
            return "Error in sending email: "+ex;
        }
    }
	
	private void sendEmail() throws Exception{

//		SimpleMailMessage mensaje = new SimpleMailMessage();
//		
//		mensaje.setFrom("floresosmar123@gmail.com");
//		mensaje.setTo("floresosmarain@gmail.com");
//		mensaje.setSubject("HOLLIS");
//		mensaje.setText("HOLIS");
//         
//        sender.send(mensaje);
		
		MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
         
        helper.setTo("floresosmarain@gmail.com");
        helper.setText("Codigo Alfanumerico: FACIL1");
        helper.setSubject("CODIGO ALFANUMERICO - CONSULTA");
         
        sender.send(message);
    }
	
	
}
