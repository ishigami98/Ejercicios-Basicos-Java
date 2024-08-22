// Enunciado:
// Un restaurante ofrece sus ofertas de acuerdo a la siguiente escala de consumo. En todos los casos se aplica un impuesto del 16%.
// Determinar el importe a pagar por lo consumido, mostrando cuanto es el descuento en cada caso.

import java.io.*;

public class Ejercicio17 {
    public static void main(String[] args) throws IOException {
        // Crea un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declaración de variables
        int PRECIO; // Variable para almacenar el precio inicial
        double IMPUESTO, D; // Variables para almacenar el impuesto y el descuento

        // Solicita al usuario que ingrese el precio inicial
        System.out.println("Ingrese el precio inicial: ");
        PRECIO = Integer.parseInt(br.readLine()); // Lee la entrada del usuario y convierte el texto a un entero

        // Verifica si el precio ingresado es positivo
        if (PRECIO > 0) {
            // Aplica descuentos y calcula el impuesto según el rango del precio
            if (PRECIO >= 250) {
                // Si el precio es mayor o igual a 250, el descuento es del 20%
                D = (PRECIO * 0.20); // Calcula el descuento
                IMPUESTO = (PRECIO - D) * 0.16; // Calcula el impuesto sobre el precio con descuento
                System.out.println("El descuento es de 20% y el importe a pagar es: " + (PRECIO - D + IMPUESTO));
            } else if (PRECIO >= 120 && PRECIO <= 249) {
                // Si el precio está entre 120 y 249, el descuento es del 15%
                D = (PRECIO * 0.15); // Calcula el descuento
                IMPUESTO = (PRECIO - D) * 0.16; // Calcula el impuesto sobre el precio con descuento
                System.out.println("El descuento es de 15% y el importe a pagar es: " + (PRECIO - D + IMPUESTO));
            } else if (PRECIO >= 30 && PRECIO <= 119) {
                // Si el precio está entre 30 y 119, el descuento es del 10%
                D = (PRECIO * 0.10); // Calcula el descuento
                IMPUESTO = (PRECIO - D) * 0.16; // Calcula el impuesto sobre el precio con descuento
                System.out.println("El descuento es de 10% y el importe a pagar es: " + (PRECIO - D + IMPUESTO));
            } else {
                // Si el precio es menor o igual a 29, el descuento es del 5%
                D = (PRECIO * 0.05); // Calcula el descuento
                IMPUESTO = (PRECIO - D) * 0.16; // Calcula el impuesto sobre el precio con descuento
                System.out.println("El descuento es de 5% y el impuesto es: " + IMPUESTO);
            }
        } else {
            // Muestra un mensaje de error si el precio ingresado es negativo o cero
            System.out.println("ERROR");
        }
    }
}