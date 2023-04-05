
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número.
 * Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
 * Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
 * Nota: recordar que las variables de tipo entero truncan los números o resultados.
 */

public class Ejercicio11 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num, cont = 0;
    
        System.out.print("Ingrese un número entero: ");
        num = leer.nextInt();
        
        while (num >= 1 ) {            
            
            num = num / 10;
            
            cont++;
        }
        
        System.out.println("Los dígitos del número ingresado es: [" + cont + "]" );
    }
}
