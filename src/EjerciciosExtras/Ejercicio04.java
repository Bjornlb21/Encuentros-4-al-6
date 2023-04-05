
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
 */

public class Ejercicio04 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un número entre 1 y 10");
        
        int num = leer.nextInt();
        
        switch (num) {
            
            case 1:
                
                System.out.println("El número [" + num + "] en Romano es [I]");
                
                break;
            
            case 2:
                
                System.out.println("El número [" + num + "] en Romano es [II]");
                
                break;
                
            case 3:
                
                System.out.println("El número [" + num + "] en Romano es [III]");
                
                break;    
                
            case 4:
                
                System.out.println("El número [" + num + "] en Romano es [IV]");
                
                break;    
                
            case 5:
                
                System.out.println("El número [" + num + "] en Romano es [V]");
                
                break;    
                
            case 6:
                
                System.out.println("El número [" + num + "] en Romano es [VI]");
                
                break;    
                
            case 7:
                
                System.out.println("El número [" + num + "] en Romano es [VII]");
                
                break;    
                
            case 8:
                
                System.out.println("El número [" + num + "] en Romano es [VIII]");
                
                break;    
                
            case 9:
                
                System.out.println("El número [" + num + "] en Romano es [IX]");
                
                break;    
                
            case 10:
                
                System.out.println("El número [" + num + "] en Romano es [X]");
                
                break;
                
            default:
                
                System.out.println("Sólo números del 1 al 10");
                
        }
       
    }

}
