
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
 * Escriba un programa que pida la cantidad de familias y 
 * para cada familia la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */

public class Ejercicio14 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int cantFam, cantHijos, edadH, edadHT = 0, totalH = 0;
    
    double mediaE;
    
    
        System.out.print("Ingrese la cantidad de Familias: ");
        cantFam = leer.nextInt();
        
        System.out.println("");
        
        for (int i = 1; i <= cantFam; i++) {
            
            System.out.print("Cuántos Hijos tiene la Familia número [" + i + "] ?: ");
            cantHijos = leer.nextInt();
           
            totalH += cantHijos;
            
            for (int j = 1; j <= cantHijos; j++) {
                
                System.out.println("");
                
                System.out.println("Qué edad tiene el Hijo número [" + j + "]?: ");
                edadH = leer.nextInt();
                
                edadHT = edadHT + edadH;
               
            }
            
            System.out.println("");
        }
        
        System.out.println("");
        
        mediaE = edadHT / totalH;
        
        System.out.println("La Edad Media de todos los Hijos de las Familias es de: [" + mediaE + "]");

    }

}
