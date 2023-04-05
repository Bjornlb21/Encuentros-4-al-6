
package EjerciciosExtras;

// @author Artyom

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */

public class Ejercicio06 {
    
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    
    int personas;
    
    double altura, altPromedio = 0, contPromedio = 0, altGeneral = 0, contGeneral = 0, alturaTotal = 0, altPromedioTotal, altPromedioGeneral;
    
        System.out.print("Ingrese la cantidad de Personas: ");
        personas = leer.nextInt();
        
        for (int i = 1; i <= personas; i++) {
            
            System.out.println("Ingrese la Altura de la Persona número: [" + i + "]");
            altura = leer.nextDouble();
            
            alturaTotal = alturaTotal + altura; 
            
            if (altura <= 1.6) {
                
                System.out.println("Cumple con el Promedio (Menos de 1.6 Mts)");
                
                altPromedio = altPromedio + altura;
                
                contPromedio++;
                
            }
           
            contGeneral++;
        }
       
        altPromedioTotal = altPromedio / contPromedio;
        
        System.out.println("La altura de las personas Promedios es de: [" + altPromedioTotal + "]");
        
        altPromedioGeneral = alturaTotal / contGeneral;
        
        System.out.println("La altura de las personas en General es de: [" + altPromedioGeneral + "]");
        
    }

}
