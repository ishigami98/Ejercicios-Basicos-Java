// Enunciado:
// Diseñar un algoritmo para contar cuántos números pares y cuántos números impares hay en un rango de números ingresados por el usuario.

import java.io.*;

public class Ejercicio15 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inicio, fin; // Variables para el rango de números
        int pares = 0, impares = 0; // Contadores para números pares e impares

        // Solicita al usuario que ingrese el inicio y fin del rango
        System.out.print("Ingrese el número inicial del rango: ");
        inicio = Integer.parseInt(br.readLine()); // Lee el número inicial y lo convierte a entero

        System.out.print("Ingrese el número final del rango: ");
        fin = Integer.parseInt(br.readLine()); // Lee el número final y lo convierte a entero

        // Verifica si el inicio es menor que el fin
        if (inicio <= fin) {
            // Bucle para contar pares e impares en el rango
            for (int i = inicio; i <= fin; i++) {
                if (i % 2 == 0) {
                    pares++; // Incrementa el contador de pares si el número es divisible por 2
                } else {
                    impares++; // Incrementa el contador de impares si el número no es divisible por 2
                }
            }
            // Muestra el conteo de pares e impares
            System.out.println("Cantidad de números pares: " + pares);
            System.out.println("Cantidad de números impares: " + impares);
        } else {
            // Mensaje de error si el inicio es mayor que el fin
            System.out.println("El número inicial debe ser menor o igual al número final.");
        }
    }
}