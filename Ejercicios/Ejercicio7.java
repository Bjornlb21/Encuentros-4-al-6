package Ejercicios;

// @author Artyom

import java.util.Scanner;

/**
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. 
 * Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
 * el primer carácter tiene que ser X y el último tiene que ser una O.
 *
 * Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
 * y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 *
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
 * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String cadenas;

        int correctas = 0, incorrectas = 0;

        System.out.println("Ingrese una Palabra que contenga solo 5 caracteres");
        System.out.println("La primera letra debe ser una X y la última una O");
        cadenas = leer.next();

        while (!cadenas.equals("&&&&&")) {

            int longitud = cadenas.length();

            if (cadenas.substring(0,1).equalsIgnoreCase("X") && cadenas.substring(4, 5).equalsIgnoreCase("O") && longitud == 5) {

                correctas++;

            } else {

                incorrectas++;

            }

            System.out.println("Ingrese nuevamente una Palabra de 5 caracteres");
            cadenas = leer.next();

        }

        System.out.println("La cantidad de Palabras Correctas son: [" + correctas + "]");

        System.out.println("La cantidad de Palabras Incorrectas son: [" + incorrectas + "]");
    }

}
