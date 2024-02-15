/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo02 {

    public static String obtenerTipo(int miEdad) {
        String cadena;
        
        if (miEdad >= 18) {
           cadena = "La edad ingresada pertenece a mayor de edad";
        } else {
            if (miEdad >= 12 && miEdad < 18) {
                cadena = "La edad ingresada pertenece a un adolecente";
            } else {
                cadena = "La edad ingresada es de un nino";
            }
        }
        return cadena;
    }
}
