// Enunciado:
// Diseñe un algoritmo que permita ingresar un número entre 1 y 12, y muestre el nombre del mes al que corresponde.
// Considerar que el 1 es para enero y 12 es para diciembre.

import java.io.*; // Importa la clase BufferedReader para la entrada de datos

public class Ejercicio16 {
    public static void main(String[] args) throws IOException {
        // Crea un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declaración de variables
        int N; // Variable para almacenar el número ingresado por el usuario
        String MES; // Variable para almacenar el nombre del mes

        // Solicita al usuario que ingrese un número
        System.out.println("Ingrese el número: ");
        N = Integer.parseInt(br.readLine()); // Lee la entrada del usuario y convierte el texto a un entero

        // Verifica si el número ingresado está en el rango válido (1 a 12)
        if (N >= 1 && N <= 12) {
            // Determina el nombre del mes basado en el número ingresado
            if (N == 1) {
                MES = "enero"; // Asigna "enero" si el número es 1
            } else if (N == 2) {
                MES = "febrero"; // Asigna "febrero" si el número es 2
            } else if (N == 3) {
                MES = "marzo"; // Asigna "marzo" si el número es 3
            } else if (N == 4) {
                MES = "abril"; // Asigna "abril" si el número es 4
            } else if (N == 5) {
                MES = "mayo"; // Asigna "mayo" si el número es 5
            } else if (N == 6) {
                MES = "junio"; // Asigna "junio" si el número es 6
            } else if (N == 7) {
                MES = "julio"; // Asigna "julio" si el número es 7
            } else if (N == 8) {
                MES = "agosto"; // Asigna "agosto" si el número es 8
            } else if (N == 9) {
                MES = "septiembre"; // Asigna "septiembre" si el número es 9
            } else if (N == 10) {
                MES = "octubre"; // Asigna "octubre" si el número es 10
            } else if (N == 11) {
                MES = "noviembre"; // Asigna "noviembre" si el número es 11
            } else {
                MES = "diciembre"; // Asigna "diciembre" si el número es 12
            }

            // Muestra el nombre del mes correspondiente
            System.out.println("El mes es " + MES);
        } else {
            // Muestra un mensaje de error si el número ingresado está fuera del rango válido
            System.out.println("Número inválido. Debe ser entre 1 y 12.");
        }
    }
}