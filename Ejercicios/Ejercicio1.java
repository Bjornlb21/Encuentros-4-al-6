
package Ejercicios;

// @author Artyom

import java.util.Scanner;

public class Ejercicio1 {
    
    // Crear un programa que dado un número determine si es par o impar.

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num = leer.nextInt();
        
        if (num % 2 == 0) {
            
            System.out.println("El número " + num + " es Par.");
            
        } else {
          
            System.out.println("El número " + num + " es Impar.");
        }

    }

}
