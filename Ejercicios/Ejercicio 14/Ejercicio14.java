// Enunciado:
// Diseñar un algoritmo para calcular la suma de los números enteros del 1 al 100 y mostrar el resultado.

public class Ejercicio14 {
    public static void main(String[] args) {
        int suma = 0; // Variable para almacenar la suma

        // Bucle para sumar los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            suma += i; // Suma el número i al total
        }

        // Muestra el resultado de la suma
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}