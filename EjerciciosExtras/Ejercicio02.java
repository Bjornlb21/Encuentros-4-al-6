
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
 * A continuación, realizar las instrucciones necesarias para que: 
 * B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
 * Mostrar los valores iniciales y los valores finales de cada variable. 
 * Utilizar sólo una variable auxiliar.
 */

public class Ejercicio02 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);

    int A = 15, B = 21, C = 13, D = 31, aux;
    
    aux = B;
    
    B = C;
    
    C = A;
    
    A = D;
    
    D = aux;
    
    System.out.println("A: [" + C +  "] --> [" + A + "]");
    System.out.println("B: [" + D +  "] --> [" + B + "]");
    System.out.println("C: [" + B +  "] --> [" + C + "]");
    System.out.println("D: [" + A +  "] --> [" + D + "]");
    
    
    
    }

}
