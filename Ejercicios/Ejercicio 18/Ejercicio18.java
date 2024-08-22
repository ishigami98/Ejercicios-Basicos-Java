// Enunciado:
// Una empresa tiene tres categorías de trabajadores: Funcionarios, Administrativos y Obreros.
// Cada uno de ellos tiene formas de pago diferentes. Un funcionario recibe X soles por hora.
// Un administrativo recibe W soles por hora y los obreros ganan Z soles por hora.
// Ingresar la categoría del trabajador y el número de horas laboradas y determinar su sueldo neto,
// si sobre su sueldo básico se le descuenta el 18 % por impuestos.

import java.io.*;

public class Ejercicio18 {
    public static void main(String[] args) throws IOException {
        // Crea un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Declaración de variables
        double NHL, SN, SB, D, X, W, Z; // Variables para horas trabajadas, sueldo neto, sueldo básico, descuento y tarifas por hora
        char CAT; // Variable para la categoría del trabajador

        // Solicita al usuario que ingrese la categoría del trabajador
        System.out.print("Ingrese la categoría del trabajador (F/A/O): ");
        CAT = br.readLine().charAt(0); // Lee la entrada del usuario y toma el primer carácter

        // Solicita al usuario que ingrese el número de horas laboradas
        System.out.print("Ingrese el número de horas laboradas: ");
        NHL = Double.parseDouble(br.readLine()); // Lee la entrada del usuario y convierte el texto a un número decimal

        // Verifica si la categoría es válida y las horas trabajadas son positivas
        if ((CAT == 'F' || CAT == 'A' || CAT == 'O') && (NHL > 0)) {
            if (CAT == 'F') {
                // Si la categoría es Funcionario
                System.out.print("Ingrese el precio de la hora para Funcionarios: ");
                X = Double.parseDouble(br.readLine()); // Lee el precio de la hora
                SB = X * NHL; // Calcula el sueldo básico
            } else if (CAT == 'A') {
                // Si la categoría es Administrativo
                System.out.print("Ingrese el precio de la hora para Administrativos: ");
                W = Double.parseDouble(br.readLine()); // Lee el precio de la hora
                SB = W * NHL; // Calcula el sueldo básico
            } else {
                // Si la categoría es Obrero
                System.out.print("Ingrese el precio de la hora para Obreros: ");
                Z = Double.parseDouble(br.readLine()); // Lee el precio de la hora
                SB = Z * NHL; // Calcula el sueldo básico
            }

            // Calcula el descuento del 18% sobre el sueldo básico
            D = SB * 0.18;
            // Calcula el sueldo neto después del descuento
            SN = SB - D;
            System.out.println("El sueldo neto es: " + SN);
        } else {
            // Muestra un mensaje de error si los datos ingresados son inválidos
            System.out.println("Error en los datos ingresados.");
        }
    }
}