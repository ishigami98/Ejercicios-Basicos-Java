// Enunciado:
// Diseñar un algoritmo para calcular el valor absoluto de un número entero ingresado por el usuario.

import java.io.*;

public class Ejercicio13 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numero; // Variable para almacenar el número ingresado

        // Solicita al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        numero = Integer.parseInt(br.readLine()); // Lee el número y lo convierte a entero

        // Calcula el valor absoluto del número
        int valorAbsoluto = (numero < 0) ? -numero : numero;
        // Muestra el valor absoluto
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
    }
}