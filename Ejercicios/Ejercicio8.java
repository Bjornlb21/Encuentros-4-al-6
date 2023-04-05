
package Ejercicios;

// @author Artyom

import java.util.Scanner;

/**
* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
* Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* 
  * * * *
  *     *
  *     *
  * * * * 
*/

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero");
        
        int num = leer.nextInt();
     
        for (int i = 1; i <= num; i++) {
            
            for (int j = 1; j <= num; j++) {
                
                if ((i == 1) || (i == num)) {
                    
                    System.out.print("*");
                    
                } else if ((j == 1) || (j == num)) {
                    
                    System.out.print("*");
                    
                } else {
                    
                    System.out.print(" ");
                }
               
            }
           
        System.out.println("");
            
        } 
    }
}
