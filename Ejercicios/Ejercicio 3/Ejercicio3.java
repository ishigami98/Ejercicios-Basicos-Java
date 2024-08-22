// Enunciado:
// Una empresa tiene tres categorías de trabajadores: Funcionarios, Administrativos y Obreros.
// Cada uno de ellos tiene formas de pago diferentes. Un funcionario recibe X soles por hora.
// Un administrativo recibe W soles por hora y los obreros ganan Z soles por hora.
// Ingresar la categoría del trabajador y el número de horas laboradas y determinar su sueldo neto,
// si sobre su sueldo básico se le descuenta el 18 % por impuestos.

import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        // Crear un objeto BufferedReader para leer la entrada del usuario
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double NHL, SN, SB, D, X, W, Z; // Variables para horas trabajadas, sueldo neto, sueldo básico, descuento e ingresos por hora
        char CAT; // Variable para la categoría del trabajador

        // Solicita al usuario que ingrese la categoría del trabajador
        System.out.print("Ingrese la categoría del trabajador (F/A/O): ");
        CAT = br.readLine().charAt(0); // Lee la categoría y la convierte a carácter

        // Solicita al usuario que ingrese el número de horas laboradas
        System.out.print("Ingrese el número de horas laboradas: ");
        NHL = Double.parseDouble(br.readLine()); // Lee las horas laboradas y las convierte a decimal

        // Verifica si la categoría es válida y las horas son mayores que 0
        if ((CAT == 'F' || CAT == 'A' || CAT == 'O') && (NHL > 0)) {
            // Calcula el sueldo básico según la categoría
            if (CAT == 'F') {
                System.out.print("Ingrese el precio de la hora para Funcionarios: ");
                X = Double.parseDouble(br.readLine()); // Lee el precio por hora para funcionarios
                SB = X * NHL; // Calcula el sueldo básico para funcionarios
            } else if (CAT == 'A') {
                System.out.print("Ingrese el precio de la hora para Administrativos: ");
                W = Double.parseDouble(br.readLine()); // Lee el precio por hora para administrativos
                SB = W * NHL; // Calcula el sueldo básico para administrativos
            } else {
                System.out.print("Ingrese el precio de la hora para Obreros: ");
                Z = Double.parseDouble(br.readLine()); // Lee el precio por hora para obreros
                SB = Z * NHL; // Calcula el sueldo básico para obreros
            }

            // Calcula el descuento del 18% sobre el sueldo básico
            D = SB * 0.18;
            // Calcula el sueldo neto después del descuento
            SN = SB - D;
            // Muestra el sueldo neto
            System.out.println("El sueldo Neto es: " + SN);
        } else {
            // Mensaje de error si la categoría o las horas ingresadas son inválidas
            System.out.println("Error en datos ingresados.");
        }
    }
}