package com.mycompany.actividad1;

import java.io.*;
import java.util.Scanner;

public class GestionArchivo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes a guardar: ");
        int cantidadEstudiantes = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de linea despues del numero

        try {
            // Abrir el archivo para escritura
            BufferedWriter writer = new BufferedWriter(new FileWriter("estudiantes.txt"));

            for (int i = 0; i < cantidadEstudiantes; i++) {
                System.out.println("Ingrese los datos del estudiante(Nombre, Edad, Promedio): ");
                String datosEstudiante = scanner.nextLine();

                // Guardar los datos en el archivo
                writer.write(datosEstudiante);
                writer.newLine(); // Agregar salto de linea para el siguiente estudiante
            }

            // Cerrar el archivo
            writer.close();

            System.out.println("Datos de estudiantes guardados correctamente en el archivo.");
            
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        } finally {
            scanner.close(); // Cerrar el scanner al finalizar
        }
    }

}