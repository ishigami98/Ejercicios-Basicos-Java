// Enunciado:
// Leer 2 notas de un alumno N1, N2 y obtener su promedio. Si el alumno obtiene un promedio ≥ 11, entonces aprueba directamente.
// Sino, tiene derecho a rendir un examen sustitutorio cuya nota N3 reemplaza la menor de las 2 notas iniciales y se calcula nuevamente el promedio.
// Si el nuevo promedio es ≥ 11 entonces el alumno aprueba con sustitutorio, sino es alumno definitivamente desaprobado.
// Se pide ingresar las notas que sean necesarias y reportar el promedio del alumno indicando su situación académica.

import java.io.*;

public class Ejercicio5 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double N1, N2, N3, P1, P2, menor; // Variables para las notas y promedios

        // Solicita al usuario que ingrese las dos primeras notas
        System.out.print("Ingrese NOTA 1: ");
        N1 = Double.parseDouble(br.readLine()); // Lee la primera nota

        System.out.print("Ingrese NOTA 2: ");
        N2 = Double.parseDouble(br.readLine()); // Lee la segunda nota

        // Verifica si las notas están en el rango válido
        if ((N1 >= 0 && N1 <= 20) && (N2 >= 0 && N2 <= 20)) {
            P1 = (N1 + N2) / 2; // Calcula el promedio de las dos primeras notas

            // Verifica si el promedio es mayor o igual a 11
            if (P1 >= 11) {
                System.out.println("El alumno aprueba directamente con promedio: " + P1);
            } else {
                System.out.println("El alumno desaprueba, tiene derecho a rendir sustitutorio.");

                // Solicita al usuario que ingrese la nota del examen sustitutorio
                System.out.print("Ingrese NOTA 3: ");
                N3 = Double.parseDouble(br.readLine()); // Lee la nota del examen sustitutorio

                // Verifica si la nota del examen sustitutorio está en el rango válido
                if (N3 >= 0 && N3 <= 20) {
                    // Determina la menor de las tres notas
                    if ((N1 <= N2) && (N1 <= N3)) {
                        menor = N1;
                    } else if ((N2 <= N1) && (N2 <= N3)) {
                        menor = N2;
                    } else {
                        menor = N3;
                    }

                    P2 = ((N1 + N2 + N3) - menor) / 2; // Calcula el nuevo promedio

                    // Verifica si el nuevo promedio es mayor o igual a 11
                    if (P2 >= 11) {
                        System.out.println("El alumno aprueba con promedio: " + P2);
                    } else {
                        System.out.println("El alumno desaprueba definitivamente.");
                    }
                } else {
                    // Mensaje de error si la nota del examen sustitutorio es inválida
                    System.out.println("Datos inválidos, rango 0-20.");
                }
            }
        } else {
            // Mensaje de error si las notas iniciales son inválidas
            System.out.println("Datos inválidos, rango 0-20.");
        }
    }
}