package redes.Cosa_de_redes.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import redes.Cosa_de_redes.restservice.Greeting.Datos;
import redes.Cosa_de_redes.restservice.Greeting.Respuesta;
import redes.Cosa_de_redes.restservice.Greeting;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1")
public class GreetinController {
	
	@GetMapping("/greeting")
	public int greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return 0;
	}
    
	@Autowired
    private ApiService apiService;

    @RequestMapping(value = "/nombre", method = RequestMethod.POST, 
        consumes = MediaType.APPLICATION_JSON_VALUE, 
        produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Respuesta generarSaludo(@RequestBody Datos datos) {
        return this.apiService.generarSaludo(datos);
    }

    @RequestMapping(value = "/validar/{rut}", method = RequestMethod.GET)
    public Respuesta validarRut(@PathVariable String rut) {
        return this.apiService.validarRut(rut);
    }
    
}