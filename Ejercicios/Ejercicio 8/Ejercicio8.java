// Enunciado:
// Diseñar un algoritmo para determinar el mayor de tres números enteros ingresados por el usuario.

import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N1, N2, N3; // Variables para almacenar los tres números

        // Solicita al usuario que ingrese los tres números
        System.out.print("Ingrese el primer número: ");
        N1 = Integer.parseInt(br.readLine()); // Lee el primer número

        System.out.print("Ingrese el segundo número: ");
        N2 = Integer.parseInt(br.readLine()); // Lee el segundo número

        System.out.print("Ingrese el tercer número: ");
        N3 = Integer.parseInt(br.readLine()); // Lee el tercer número

        // Determina el mayor de los tres números utilizando estructuras condicionales
        if (N1 >= N2 && N1 >= N3) {
            System.out.println("El mayor número es: " + N1);
        } else if (N2 >= N1 && N2 >= N3) {
            System.out.println("El mayor número es: " + N2);
        } else {
            System.out.println("El mayor número es: " + N3);
        }
    }
}