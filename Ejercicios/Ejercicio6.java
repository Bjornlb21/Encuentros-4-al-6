package Ejercicios;

// @author Artyom
import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú: 
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
 * El programa deberá ejecutarse hasta que se elija la opción 5. 
 * Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
 * se debe mostrar el siguiente mensaje de confirmación: 
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
 * caso contrario se vuelve a mostrar el menú. 
 * MENU 
 * 1 Sumar 
 * 2 Restar 
 * 3 Multiplicar 
 * 4 Dividir 
 * 5 Salir 
 * Elija Opción:
 *
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
     
        String respuesta;
        
        boolean salir = true;
        
        int opcion, suma, resta, mult, div;

        System.out.print("Ingrese un número entero: ");
        int num1 = leer.nextInt();

        System.out.print("Ingrese otro número entero: ");
        int num2 = leer.nextInt();

        System.out.println("==============================");

        do {

            System.out.println("=====MENÚ=====");
            System.out.println("1] Sumar");
            System.out.println("2] Restar");
            System.out.println("3] Multiplicar");
            System.out.println("4] Dividir");
            System.out.println("5] Salir");
            System.out.print("Elija una Opción: ");
            
            opcion = leer.nextInt();

            switch (opcion) {
                
                case 1:
                    
                    System.out.println("==================");
                    System.out.println("Suma:");

                    suma = num1 + num2;

                    System.out.println("La suma de los números es: [" + suma + "]");
                    System.out.println("===============================");
                    
                    break;

                case 2:
                    
                    System.out.println("==================");
                    System.out.println("Resta:");

                    resta = num1 - num2;

                    System.out.println("La resta de los números es: [" + resta + "]");
                    System.out.println("===============================");
                    
                    break;

                case 3:
                    
                    System.out.println("==================");
                    System.out.println("Multiplicación:");

                    mult = num1 * num2;

                    System.out.println("La Multiplicación de los números es: [" + mult + "]");
                    System.out.println("=========================================");
                    
                    break;

                case 4:
                    System.out.println("==================");
                    System.out.println("División:");

                    div = num1 / num2;

                    System.out.println("La división de los números es: [" + div + "]");
                    System.out.println("==================================");
                    
                    break;
                    
                case 5:
                    
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    
                    respuesta = leer.next();
                    
                    if (respuesta.equalsIgnoreCase("S")) {
                        
                        salir = false;
                        
                        break;
                        
                    } else {
                        
                        continue;
                    }

                default:

                    System.out.println("Por favor, digite la opción correcta");
            }

        } while (salir);

    }

}
