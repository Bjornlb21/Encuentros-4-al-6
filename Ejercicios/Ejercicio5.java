
package Ejercicios;

// @author Artyom

import java.util.Scanner;

public class Ejercicio5 {
    
    // Escriba un programa en el cual se ingrese un valor líímite positivo, 
    // y a continuaciónn solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.


    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite inicial");
        
        int limI = leer.nextInt();
        
        int num;
        
        int suma = 0;
                
        do {            
            
            System.out.println("Ingrese números a sumar");
            
            num = leer.nextInt();
            
            suma = suma + num;
            
        } while (suma <= limI);
            
            System.out.println("La suma de los números es: " + suma);
        }
        
        
    }


