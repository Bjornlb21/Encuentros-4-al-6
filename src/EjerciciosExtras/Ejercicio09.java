
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Simular la división usando solamente restas. 
 * Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
 * Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
 *         y el número de restas realizadas es el cociente.
 * Por ejemplo: 50 / 13:
 * 50 – 13 = 37 una resta realizada
 * 37 – 13 = 24 dos restas realizadas
 * 24 – 13 = 11 tres restas realizadas
 * dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 * ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */

public class Ejercicio09 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int num1, num2, cociente = 0, residuo = 0, resta = 0, i = 1;
    
        System.out.print("Ingrese un número entero (Mayor que 1): ");
        num1 = leer.nextInt();
        System.out.print("Ingrese otro número entero (Mayor que 1): ");
        num2 = leer.nextInt();
        
        System.out.println("");
        
        System.out.println(+ num1 + " / " + num2);
        
        System.out.println("");
        
        while (num1 >= num2) {   
           
            System.out.println(+ num1 + " - " + num2 + " = " + (num1 - num2) + " [" + i + "] Resta Realizada");
           
            num1 = num1 - num2; 
             
            residuo = num1;
            
            cociente++;
            
            i++;
        }
        
        System.out.println("");
        
        System.out.println("Dado que [" + num1 + "] es menor que [" + num2 + "] el residuo es: [" + residuo + "] "
                            + "y el cociente es [" + cociente + "]" );
        
        System.out.println("");
        
    }

}
