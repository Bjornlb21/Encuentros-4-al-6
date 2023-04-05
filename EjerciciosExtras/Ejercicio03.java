
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
 * Caso contrario mostrar un mensaje. 
 * Nota: investigar la función equals() de la clase String.
 */

public class Ejercicio03 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
        String letra;
    
        System.out.println("Ingrese una Letra");
        
        letra = leer.next();
        
        letra = letra.toUpperCase();
    
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            
            System.out.println("La letra ingresada es una Vocal");
            
        } else {
            
            System.out.println("La letra ingresada no es una vocal");
            
        }
        
        
    }

}
