/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author lukas
 */
@WebService(serviceName = "metodos_ws")
public class metodos_ws {

    @WebMethod(operationName = "nombre_propio")
    public String nombre_propio(@WebParam(name = "nombre") String nombre, @WebParam(name = "genero") String genero) {
        String stg="";
        char letrauno=' ';
        char c= ' ';
        int aux=0;
        
        for(int i=0; i<nombre.length();i++){
            letrauno=nombre.charAt(0);
            c=nombre.charAt(i);
            
            if(letrauno==' '){
                stg="No inicialice el nombre con un espacio";
            }else if(!Character.isLetter(letrauno)){
                stg="No inicialice el nombre con un numero";
            }
            
            if(i==0){
                c=Character.toUpperCase(c);
            }
            if(i>=1){
                c=Character.toLowerCase(c);
            }
            if(c==' '){
                aux=(i+1);
            }
            if(aux==i){
                c=Character.toUpperCase(c);
            }
            stg+=c;
        }
        if(genero.equals("F") || genero.equals("f")){
            return "Sra." + stg;
        }else if(genero.equals("G") || genero.equals("g")){
            return "Sr." + stg;
        }else{
            return "Opción no válida";
        }   
    }

    @WebMethod(operationName = "val_digito")
    public String val_digito(@WebParam(name = "rut") String rut) {
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
                    return "El dígito verificador " + dv + " es correcto para el RUT " + rut;
                } else {
                    return "El dígito verificador " + dv + " es incorrecto para el RUT " + rut;
                }
            }
            return "Ingrese sólo números, guión y puntos.";
        } 
        catch (Exception e) {
            throw e;
        }
    }
}