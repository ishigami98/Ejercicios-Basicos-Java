// Enunciado:
// Diseñar un algoritmo para determinar el mayor de tres números ingresados por el usuario.

import java.io.*;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declarar variables para almacenar los tres números ingresados
        int num1, num2, num3;

        // Solicita al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(br.readLine()); // Lee el primer número y lo convierte a entero

        // Solicita al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(br.readLine()); // Lee el segundo número y lo convierte a entero

        // Solicita al usuario que ingrese el tercer número
        System.out.print("Ingrese el tercer número: ");
        num3 = Integer.parseInt(br.readLine()); // Lee el tercer número y lo convierte a entero

        // Determina cuál es el mayor de los tres números usando estructuras condicionales
        if (num1 >= num2 && num1 >= num3) {
            // Si num1 es mayor o igual que num2 y num3, num1 es el mayor
            System.out.println("El número mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            // Si num2 es mayor o igual que num1 y num3, num2 es el mayor
            System.out.println("El número mayor es: " + num2);
        } else {
            // Si num3 es mayor o igual que num1 y num2, num3 es el mayor
            System.out.println("El número mayor es: " + num3);
        }
    }
}