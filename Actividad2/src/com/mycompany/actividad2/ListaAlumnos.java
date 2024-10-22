package com.mycompany.actividad2;

import java.util.*;

public class ListaAlumnos {
    public static void main(String[] args) {
        List<String> nombresAlumnos = new ArrayList<>();

        registrarAlumno(nombresAlumnos,"Juan");
        registrarAlumno(nombresAlumnos,"Ana");

        System.out.println("Juan esta registrado? " + buscarAlumno(nombresAlumnos, "Juan"));

        eliminarAlumno(nombresAlumnos, "Ana");

        System.out.println("Alumnos restantes: " + nombresAlumnos);


    }


    private static void registrarAlumno(List<String> nombresAlumnos, String nombre) {
        nombresAlumnos.add(nombre);
    }

    private static boolean buscarAlumno(List<String> nombresAlumnos, String nombre) {
        return nombresAlumnos.contains(nombre);
    }

    private static void eliminarAlumno(List<String> nombresAlumnos, String nombre) {
        nombresAlumnos.remove(nombre);
    }

}

