// Enunciado:
// Diseñe un algoritmo que permita ingresar un número entre 1 y 12, y muestre el nombre del mes al que corresponde.
// Considerar que el 1 es para enero y 12 es para diciembre.

import java.io.*;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N; // Variable para almacenar el número del mes
        String MES; // Variable para almacenar el nombre del mes

        // Solicita al usuario que ingrese un número
        System.out.println("Ingrese el número (1-12): ");
        N = Integer.parseInt(br.readLine()); // Lee el número y lo convierte a entero

        // Verifica si el número está en el rango válido
        if (N >= 1 && N <= 12) {
            // Determina el nombre del mes según el número ingresado
            if (N == 1) {
                MES = "enero";
            } else if (N == 2) {
                MES = "febrero";
            } else if (N == 3) {
                MES = "marzo";
            } else if (N == 4) {
                MES = "abril";
            } else if (N == 5) {
                MES = "mayo";
            } else if (N == 6) {
                MES = "junio";
            } else if (N == 7) {
                MES = "julio";
            } else if (N == 8) {
                MES = "agosto";
            } else if (N == 9) {
                MES = "septiembre"; // Nota: "septiembre" es el término correcto en español
            } else if (N == 10) {
                MES = "octubre";
            } else if (N == 11) {
                MES = "noviembre";
            } else {
                MES = "diciembre";
            }
            // Muestra el nombre del mes
            System.out.println("El mes es " + MES);
        } else {
            // Mensaje de error si el número no está en el rango válido
            System.out.println("Número inválido. Debe estar entre 1 y 12.");
        }
    }
}