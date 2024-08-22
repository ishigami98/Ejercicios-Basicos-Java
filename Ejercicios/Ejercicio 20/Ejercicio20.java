// Enunciado:
// Leer 2 notas de un alumno N1, N2 y obtener su promedio. Si el alumno obtiene un promedio ≥ 11, entonces aprueba directamente.
// Sino, tiene derecho a rendir un examen sustitutorio cuya nota N3 reemplaza la menor de las 2 notas iniciales y se calcula nuevamente el promedio.
// Si el nuevo promedio es ≥ 11, entonces el alumno aprueba con sustitutorio, sino es alumno definitivamente desaprobado.
// Se pide ingresar las notas que sean necesarias y reportar el promedio del alumno indicando su situación académica.

import java.io.*;

public class Ejercicio20 {
    public static void main(String[] args) throws IOException {
        // Crea un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declaración de variables
        double N1, N2, N3, P1, P2, menor; // Variables para las notas y promedios
       
        // Solicita al usuario que ingrese la primera nota
        System.out.print("Ingrese NOTA 1: ");
        N1 = Double.parseDouble(br.readLine()); // Lee la nota 1 y la convierte a un número decimal

        // Solicita al usuario que ingrese la segunda nota
        System.out.print("Ingrese NOTA 2: ");
        N2 = Double.parseDouble(br.readLine()); // Lee la nota 2 y la convierte a un número decimal

        // Verifica si las notas ingresadas están en el rango válido (0-20)
        if ((N1 >= 0 && N1 <= 20) && (N2 >= 0 && N2 <= 20)) {
            // Calcula el promedio de las dos notas iniciales
            P1 = (N1 + N2) / 2;

            // Verifica si el promedio inicial es mayor o igual a 11
            if (P1 >= 11) {
                System.out.println("El alumno aprueba directamente con promedio: " + P1);
            } else {
                // Si el promedio es menor de 11, permite rendir un examen sustitutorio
                System.out.println("El alumno desaprueba, tiene derecho a rendir sustitutorio.");

                // Solicita al usuario que ingrese la nota del examen sustitutorio
                System.out.print("Ingrese NOTA 3: ");
                N3 = Double.parseDouble(br.readLine()); // Lee la nota 3 y la convierte a un número decimal

                // Verifica si la nota del sustitutorio está en el rango válido (0-20)
                if (N3 >= 0 && N3 <= 20) {
                    // Determina cuál de las dos primeras notas es la menor
                    if ((N1 <= N2) && (N1 <= N3)) {
                        menor = N1; // Nota 1 es la menor
                    } else if ((N2 <= N1) && (N2 <= N3)) {
                        menor = N2; // Nota 2 es la menor
                    } else {
                        menor = N3; // Nota 3 es la menor
                    }

                    // Calcula el nuevo promedio reemplazando la nota menor por la nota del sustitutorio
                    P2 = ((N1 + N2 + N3) - menor) / 2;

                    // Verifica si el nuevo promedio es mayor o igual a 11
                    if (P2 >= 11) {
                        System.out.println("El alumno aprueba con promedio: " + P2);
                    } else {
                        System.out.println("El alumno desaprueba definitivamente.");
                    }
                } else {
                    // Muestra un mensaje de error si la nota del sustitutorio está fuera de rango
                    System.out.println("Datos inválidos, rango 0-20.");
                }
            }
        } else {
            // Muestra un mensaje de error si las notas iniciales están fuera de rango
            System.out.println("Datos inválidos, rango 0-20.");
        }
    }
}