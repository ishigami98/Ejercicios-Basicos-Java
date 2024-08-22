// Enunciado:
// Diseñar un algoritmo para calcular el promedio de una serie de números ingresados por el usuario hasta que se ingrese un número negativo.

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double numero, suma = 0, promedio;
        int contador = 0;

        // Solicita al usuario que ingrese números y calcula la suma y el promedio
        System.out.println("Ingrese números para calcular el promedio (ingrese un número negativo para finalizar):");

        // Bucle para ingresar números hasta que se ingrese un número negativo
        while (true) {
            numero = Double.parseDouble(br.readLine()); // Lee el número y lo convierte a decimal

            if (numero < 0) {
                break; // Termina el bucle si el número es negativo
            }

            suma += numero; // Suma el número al total
            contador++; // Incrementa el contador de números ingresados
        }

        // Verifica si se ingresaron números válidos
        if (contador > 0) {
            promedio = suma / contador; // Calcula el promedio
            // Muestra el promedio
            System.out.println("El promedio es: " + promedio);
        } else {
            // Mensaje de error si no se ingresaron números válidos
            System.out.println("No se ingresaron números válidos.");
        }
    }
}