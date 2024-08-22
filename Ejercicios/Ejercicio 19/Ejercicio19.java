// Enunciado:
// En una tienda se ha establecido la siguiente oferta: por compras menores a 150 soles se hace un descuento de 8%,
// pero para compras a partir de 150 el descuento es de 15%. En cualquier caso, se le incrementa el 18% de lo que se debería pagar,
// por concepto de IGV. Se pide ingresar la cantidad y el precio del producto que se compra y determinar el monto total de la compra,
// cuánto se descontará, el pago luego del descuento, cuanto se paga por IGV y cuanto se pagará en total.

import java.io.*;

public class Ejercicio19 {
    public static void main(String[] args) throws IOException {
        // Crea un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declaración de variables
        double C, P, TC, D, PCD, IGV, PT; // Variables para cantidad, precio, total de compra, descuento, precio con descuento, IGV y precio total

        // Solicita al usuario que ingrese la cantidad del producto
        System.out.print("La cantidad es: ");
        C = Double.parseDouble(br.readLine()); // Lee la cantidad y la convierte a un número decimal

        // Solicita al usuario que ingrese el precio del producto
        System.out.print("El precio es: ");
        P = Double.parseDouble(br.readLine()); // Lee el precio y lo convierte a un número decimal

        // Verifica si la cantidad y el precio son positivos
        if (C > 0 && P > 0) {
            // Calcula el total de la compra antes de aplicar descuentos
            TC = C * P;
            // Calcula el IGV del 18%
            IGV = TC * 0.18;

            // Aplica descuento según el total de la compra
            if (TC >= 150) {
                // Si el total es 150 o más, el descuento es del 15%
                D = TC * 0.15;
            } else {
                // Si el total es menos de 150, el descuento es del 8%
                D = TC * 0.08;
            }

            // Calcula el precio con descuento
            PCD = TC - D;
            // Calcula el precio total incluyendo el IGV
            PT = PCD + IGV;

            // Muestra los resultados
            System.out.println("El TOTAL DE LA COMPRA ES: " + TC);
            System.out.println("EL DESCUENTO ES: " + D);
            System.out.println("EL IGV ES: " + IGV);
            System.out.println("EL PRECIO CON DESCUENTO ES: " + PCD);
            System.out.println("EL PRECIO TOTAL DE LA COMPRA ES: " + PT);
        } else {
            // Muestra un mensaje de error si los datos ingresados son inválidos
            System.out.println("Error en los datos ingresados.");
        }
    }
}