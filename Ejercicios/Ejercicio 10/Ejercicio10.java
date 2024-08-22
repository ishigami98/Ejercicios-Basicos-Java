// Enunciado:
// Diseñar un algoritmo para verificar si un número entero ingresado por el usuario es primo.

import java.io.*;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N; // Variable para almacenar el número ingresado
        boolean esPrimo = true; // Variable para verificar si el número es primo

        // Solicita al usuario que ingrese un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        N = Integer.parseInt(br.readLine()); // Lee el número y lo convierte a entero

        // Verifica si el número es mayor que 1
        if (N > 1) {
            // Bucle para verificar si el número es divisible por cualquier número menor que él
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    esPrimo = false; // El número no es primo si es divisible por i
                    break; // Sale del bucle
                }
            }
            // Muestra si el número es primo o no
            if (esPrimo) {
                System.out.println("El número " + N + " es primo.");
            } else {
                System.out.println("El número " + N + " no es primo.");
            }
        } else {
            // Mensaje de error si el número es menor o igual a 1
            System.out.println("El número debe ser mayor que 1.");
        }
    }
}