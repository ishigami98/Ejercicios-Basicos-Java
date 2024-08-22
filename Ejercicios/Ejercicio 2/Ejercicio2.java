// Enunciado:
// Un restaurante ofrece sus ofertas de acuerdo a la siguiente escala de consumo. En todos los casos se aplica un impuesto del 16%.
// Determinar el importe a pagar por lo consumido, mostrando cuanto es el descuento en cada caso.

import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int PRECIO; // Variable para almacenar el precio inicial
        double IMPUESTO, D; // Variables para el impuesto y el descuento

        // Solicita al usuario que ingrese el precio inicial
        System.out.println("Ingrese el precio inicial: ");
        PRECIO = Integer.parseInt(br.readLine()); // Lee el precio y lo convierte a entero

        // Verifica si el precio es mayor que 0
        if (PRECIO > 0) {
            // Aplica el descuento y calcula el importe a pagar según el rango del precio
            if (PRECIO >= 250) {
                D = PRECIO * 0.20; // Descuento del 20%
                IMPUESTO = (PRECIO - D) * 0.16; // Impuesto del 16% sobre el precio con descuento
                System.out.println("El descuento es de 20% y el importe a pagar es: " + (PRECIO - D + IMPUESTO));
            } else if (PRECIO >= 120 && PRECIO <= 249) {
                D = PRECIO * 0.15; // Descuento del 15%
                IMPUESTO = (PRECIO - D) * 0.16; // Impuesto del 16% sobre el precio con descuento
                System.out.println("El descuento es de 15% y el importe a pagar es: " + (PRECIO - D + IMPUESTO));
            } else if (PRECIO >= 30 && PRECIO <= 119) {
                D = PRECIO * 0.10; // Descuento del 10%
                IMPUESTO = (PRECIO - D) * 0.16; // Impuesto del 16% sobre el precio con descuento
                System.out.println("El descuento es de 10% y el importe a pagar es: " + (PRECIO - D + IMPUESTO));
            } else {
                D = PRECIO * 0.05; // Descuento del 5%
                IMPUESTO = (PRECIO - D) * 0.16; // Impuesto del 16% sobre el precio con descuento
                System.out.println("El descuento es de 5% y el importe a pagar es: " + (PRECIO - D + IMPUESTO));
            }
        } else {
            // Mensaje de error si el precio es menor o igual a 0
            System.out.println("ERROR: El precio debe ser mayor que 0.");
        }
    }
}