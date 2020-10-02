package redes.Cosa_de_redes.restservice;

//import redes.Cosa_de_redes.restservice.Greeting;
import redes.Cosa_de_redes.restservice.Greeting.Datos;
import redes.Cosa_de_redes.restservice.Greeting.Respuesta;


public interface ApiService {
    public Respuesta generarSaludo(Datos datos);
    public Respuesta validarRut(String rut);
    
}