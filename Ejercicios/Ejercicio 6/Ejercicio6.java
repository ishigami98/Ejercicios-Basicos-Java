// Enunciado:
// Diseñar un algoritmo para calcular el factorial de un número entero positivo ingresado por el usuario.
// El factorial de un número n es el producto de todos los números enteros positivos menores o iguales a n.

import java.io.*;

public class Ejercicio6 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N; // Variable para almacenar el número del cual se calculará el factorial
        long factorial = 1; // Variable para almacenar el resultado del factorial

        // Solicita al usuario que ingrese un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        N = Integer.parseInt(br.readLine()); // Lee el número y lo convierte a entero

        // Verifica si el número es positivo
        if (N >= 0) {
            // Calcula el factorial utilizando un bucle
            for (int i = 1; i <= N; i++) {
                factorial *= i; // Multiplica el factorial por el valor de i en cada iteración
            }
            // Muestra el resultado del factorial
            System.out.println("El factorial de " + N + " es: " + factorial);
        } else {
            // Mensaje de error si el número es negativo
            System.out.println("Error: El número debe ser entero positivo.");
        }
    }
}