
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Ejercicio01 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
        
        int min;
        
        double dias, horas;
        
        System.out.println("Ingrese una cantidad de Minutos");
        
        min = leer.nextInt();
    
        horas = min / 60;
        
        dias = horas / 24;
        
        horas = horas - (Math.floor(dias) * 24);
        
        dias = Math.floor(dias);
        
        System.out.println("Los [" + min + "] Minutos ingresados equivalen a: [" + dias + "] días y [" + horas + "] horas.");
    }

}
