
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
 * El programa debe indicar al usuario si su respuesta es o no correcta. 
 * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
 * Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */

public class Ejercicio10 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num1 = (int) (Math.random() * 10 + 1), num2 = (int) (Math.random() * 10 + 1), respuesta, mult, i = 0;
    
        System.out.println(+ num1);
        System.out.println(+ num2);
    
    
        System.out.print("Ingrese un número para adivinar la multiplicación: ");
        respuesta = leer.nextInt();
        
        mult = num1 * num2;
        
        while (i < respuesta) {   
            
          if (respuesta == mult) {
            
            System.out.println("!Adivinaste!, el resultado es: [" + mult + "]");
            
            break;
            
        } else {
            
            System.out.println("Ingrese nuevamente el resultado a adivinar");
            respuesta = leer.nextInt();
            
        }
            
        }
    }
}
