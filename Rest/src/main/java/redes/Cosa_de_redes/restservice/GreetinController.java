package redes.Cosa_de_redes.restservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetinController {
    


	@GetMapping("/greeting")
	public int greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return 0;
	}
    
}