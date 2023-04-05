
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. 
 * Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, 
 *    la cantidad de números pares y la cantidad de números impares. 
 * Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
 * Nota: recordar el uso de la sentencia break.
 */

public class Ejercicio08 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num, par = 0, impar = 0, mult, i = 0, leidos = 0;
    
        do {      
            
            System.out.println("Ingrese un número entero:");
             num = leer.nextInt();
             
             if (num % 2 == 0) {
                
                par++;
                
            } else {
                 
                 impar++;
             }
            
            leidos++;
            
        } while ((num % 5) != 0);
        
        System.out.println("Los números leídos son: [" + leidos + "]");
        System.out.println("Los números pares son: [" + par + "]");
        System.out.println("Los números impares son: [" + impar + "]");
        
    }

}
