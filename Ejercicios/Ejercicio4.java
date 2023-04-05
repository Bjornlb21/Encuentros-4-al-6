
package Ejercicios;

// @author Artyom

import java.util.Scanner;

public class Ejercicio4 {
    
    // Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
    // Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
    // en caso contrario, se deberá  imprimir “INCORRECTO”. 
    // Nota: investigar la función Substring y equals() de Java.
    
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase o palabra que empiece con 'A'");   
        
        String frase = leer.nextLine();
      
        String primera;
        
        primera = frase.substring(0,1);
        
        if (primera.equalsIgnoreCase("A")) {
            
            System.out.println("CORRECTO");
            
        } else { 
            
            System.out.println("INCORRECTO");
            
        }

    }

}