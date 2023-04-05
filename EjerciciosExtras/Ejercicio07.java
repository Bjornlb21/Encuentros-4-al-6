
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
 * El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario. 
 * Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”
 */

public class Ejercicio07 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num, numeros, valMax = 0, valMin = 0, sumaMax = 0, sumaMin = 0, i = 0;
    
    double promedio;
    
        System.out.print("Cuántos números desea ingresar al sistema?: ");
        num = leer.nextInt();
        
        
        while (i < num) {            
            
            System.out.println("Ingrese un valor para cada número");
            numeros = leer.nextInt();
            
            if (numeros > valMax) {
                
                valMax = numeros;
                
                sumaMax = sumaMax + valMax;
            
            } else {
            
                valMin = numeros;
                
                sumaMin = sumaMin + valMin;
            }
          
            i++;
            
        }
    
        System.out.println("El valor máximo es: " + valMax);
        System.out.println("El valor mínimo es: " + valMin);
        
        promedio = (sumaMax + sumaMin) / num;
        
        System.out.println("El Promedio de los números es de: " + promedio);

    }

}
