
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y termine en el número de la línea. 
 * Solicitar la altura de la escalera al usuario al comenzar. 
 * Ejemplo: si se ingresa el número 3:
 * 1
 * 12
 * 123
 */

public class Ejercicio13 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num, cont = 0;
    
        System.out.print("Ingrese un número para la Escalera: ");
        num = leer.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print("[" + j + "]");
            }
            
          System.out.println("");
          
        }
        
        
    }

}
