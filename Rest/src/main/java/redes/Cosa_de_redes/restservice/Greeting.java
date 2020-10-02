package redes.Cosa_de_redes.restservice;

import redes.Cosa_de_redes.restservice.ApiService;
import org.apache.commons.text.WordUtils;
import org.springframework.stereotype.Service;


@Service
public class Greeting implements ApiService {

    public static class Datos {
        private String nombres;
        private String paterno;
        private String materno;
        private String genero;

        public Datos(String nombres, String paterno, String materno, String genero) {
            this.nombres = nombres;
            this.paterno = paterno;
            this.materno = materno;
            this.genero = genero;
        }
        public String getNombres() {
            return nombres;
        }
        public void setNombres(String nombres) {
            this.nombres = nombres;
        }
        public String getPaterno() {
            return paterno;
        }
        public void setPaterno(String paterno) {
            this.paterno = paterno;
        }
        public String getMaterno() {
            return materno;
        }
        public void setMaterno(String materno) {
            this.materno = materno;
        }
        public String getGenero() {
            return genero;
        }
        public void setGenero(String genero) {
            this.genero = genero;
        }
    }
    
    public static class Respuesta {
        private Boolean estado;
        private String mensaje;

        public Respuesta(Boolean estado, String mensaje) {
            this.estado = estado;
            this.mensaje = mensaje;
        }
        public Boolean getEstado() {
            return estado;
        }
        public void setEstado(Boolean estado) {
            this.estado = estado;
        }
        public String getMensaje() {
            return mensaje;
        }
        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }
    }

    @Override
    public Respuesta generarSaludo(Datos datos) {
        try {
            Boolean mujer = false;
            String saludo = "";
            String mensaje;
            if (datos.getGenero() != null) {
                if (datos.getGenero().toUpperCase().equals("F")) {
                    mujer = true;
                    saludo = "Sra. ";
                } else if (datos.getGenero().toUpperCase().equals("M")) {
                    saludo = "Sr. ";
                } else {
                    return new Respuesta(false, "Ingrese un género.");
                }
            } else {
                return new Respuesta(false, "Género no válido, intente nuevamente.");
            }
            if (datos.getNombres() != null && datos.getPaterno() != null && datos.getMaterno() != null) {
                String nombreCompleto = WordUtils.capitalizeFully(datos.getNombres() + " " + datos.getPaterno() + " " + datos.getMaterno());
                mensaje = (mujer ? "¡Bienvenida, " : "¡Bienvenido, ") + saludo + nombreCompleto + "!";
                return new Respuesta(true, mensaje);
            }
            return new Respuesta(false, "No se llenaron todos los campos correctamente.");
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Respuesta validarRut(String rut) {
        try {
            String rutConDv = rut.replace("-", "").replace(".", "");
            String dv = rutConDv.substring(rutConDv.length() - 1).toUpperCase();
            rut = rutConDv.substring(0, rutConDv.length() - 1);
            if (rutConDv.matches("[0-9]+") || (rut.matches("[0-9]+") && dv.equals("K"))) {
                Integer rutSinDv = Integer.valueOf(rut);
                Integer cont = 0;
                Integer suma = 1;
                while (rutSinDv != 0) {
                    suma = (suma + rutSinDv % 10 * (9 - cont++ % 6)) % 11;
                    rutSinDv /= 10;
                }
                String dvReal = String.valueOf(suma > 0 ? suma % 11 - 1 : "K");
                if (dv.equals(dvReal)) {
                    return new Respuesta(true, "El dígito verificador " + dv + " es correcto para el RUT " + rut);
                } else {
                    return new Respuesta(false, "El dígito verificador " + dv + " es incorrecto para el RUT " + rut);
                }
            }
            return new Respuesta(false, "Ingrese sólo números, guión y puntos.");
        } catch (Exception e) {
            throw e;
        }
    }
}