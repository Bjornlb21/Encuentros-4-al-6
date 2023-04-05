
package Ejercicios;

// @author Artyom

import java.util.Scanner;

public class Ejercicio2 {
    
    // Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, 
    // sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una Frase");
        
        String frase = leer.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")) {
            
            System.out.println("CORRECTO");
            
        } else {
            
            System.out.println("INCORRECTO");
            
        }

    }

}
