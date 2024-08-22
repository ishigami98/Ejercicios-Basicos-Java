// Enunciado:
// Diseñar un algoritmo para calcular el área de un triángulo dado su base y altura.

import java.io.*;

public class Ejercicio12 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double base, altura, area; // Variables para la base, altura y área del triángulo

        // Solicita al usuario que ingrese la base del triángulo
        System.out.print("Ingrese la base del triángulo: ");
        base = Double.parseDouble(br.readLine()); // Lee la base y la convierte a decimal

        // Solicita al usuario que ingrese la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        altura = Double.parseDouble(br.readLine()); // Lee la altura y la convierte a decimal

        // Verifica si la base y la altura son mayores que 0
        if (base > 0 && altura > 0) {
            // Calcula el área del triángulo
            area = (base * altura) / 2;
            // Muestra el área
            System.out.println("El área del triángulo es: " + area);
        } else {
            // Mensaje de error si la base o la altura son menores o iguales a 0
            System.out.println("La base y la altura deben ser mayores que 0.");
        }
    }
}