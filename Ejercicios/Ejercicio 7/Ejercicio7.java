// Enunciado:
// Diseñar un algoritmo para determinar si un número entero ingresado por el usuario es par o impar.

import java.io.*;

public class Ejercicio7 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N; // Variable para almacenar el número ingresado

        // Solicita al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        N = Integer.parseInt(br.readLine()); // Lee el número y lo convierte a entero

        // Verifica si el número es par o impar utilizando el operador módulo
        if (N % 2 == 0) {
            // Muestra que el número es par
            System.out.println("El número " + N + " es par.");
        } else {
            // Muestra que el número es impar
            System.out.println("El número " + N + " es impar.");
        }
    }
}