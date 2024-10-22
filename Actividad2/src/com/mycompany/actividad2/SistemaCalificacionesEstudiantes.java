package com.mycompany.actividad2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaCalificacionesEstudiantes {
    // Map es interface y HashMap es la implementacion para almacenar estudiantes y calificaciones
    private Map<String, Double> estudiantes;

    // Constructor
    public SistemaCalificacionesEstudiantes() {
        estudiantes = new HashMap<String, Double>();
    }

    // Agregar un estudiante
    public void agregarEstudiante(String nombre, double calificacion) {
        estudiantes.put(nombre, calificacion);
        System.out.println("Se agregó con éxito el estudiante: " +nombre);

    }

    // Método para actualizar la calificación de un estudiante
    public void actualizarCalificacion(String nombre, double nuevaCalificacion) {
        if (estudiantes.containsKey(nombre)) {
            estudiantes.put(nombre, nuevaCalificacion);
            System.out.println("Calificación actualizada para " + nombre);
        } else {
            System.out.println("El siguiente estudiante no existe: " + nombre);
        }
    }

    // Método para obtener la calificación de un estudiante
    public void obtenerCalificacion(String nombre) {
        // Crea variable y asigna lo que tiene el hasmap con esa clave
        Double calificacion = estudiantes.get(nombre);
        if (calificacion != null) {
            System.out.println("La calificación de " + nombre + " es: " + calificacion);
        } else {
            System.out.println("El estudiante no está en el sistema.");
        }
    }

    // Método principal para interactuar con el sistema
    public static void main(String[] args) {
        SistemaCalificacionesEstudiantes sistema = new SistemaCalificacionesEstudiantes();
        // Para pedir info del usuario (inicializacion)
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\nSistema de Calificaciones Estudiantes");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Actualizar calificación");
            System.out.println("3. Consultar calificación");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            scanner.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la calificación: ");
                    double calificacion = scanner.nextDouble();
                    sistema.agregarEstudiante(nombre, calificacion);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la nueva calificación: ");
                    double nuevaCalificacion = scanner.nextDouble();
                    sistema.actualizarCalificacion(nombre, nuevaCalificacion);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    nombre = scanner.nextLine();
                    sistema.obtenerCalificacion(nombre);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
