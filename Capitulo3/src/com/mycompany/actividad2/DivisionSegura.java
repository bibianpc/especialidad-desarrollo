package com.mycompany.actividad2;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dividendo: ");
        int dividendo = scanner.nextInt();

        System.out.println("Ingrese el divisor: ");
        int divisor = scanner.nextInt();

        try {
            // Se divide sin convertir a (double)
            // y sin validar que el divisor sea diferente de cero para forzar el error
            // y que se pueda lanzar excepcion y asi ejecutar lo que esta en el catch.
            double resultado = dividendo / divisor;
            System.out.println("Resultado de la division: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");

        } finally {
            System.out.println("se ejecuta programa");
        }
    }
}
