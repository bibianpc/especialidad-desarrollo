package com.mycompany.actividad2;


import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Tarea {
    String descripcion;
    String prioridad;

    Tarea(String descripcion, String prioridad){
        this.descripcion = descripcion;
        this.prioridad = prioridad;

    }


    public String toString() {
        return "(" + prioridad + ") " + descripcion;
    }


    public class Main {
        public static void main(String[] args){
            List<Tarea> listaTareas = new ArrayList<>();
            listaTareas.add(new Tarea("Realizar investigación para el proyecto", "Alta"));
            listaTareas.add(new Tarea("Completar informe mensual", "Media"));
            listaTareas.add(new Tarea("Coordinar reunion con el equipo", "Baja"));
            listaTareas.add(new Tarea("Actualizar base de datos de clientes", "Alta"));
            listaTareas.add(new Tarea("Preparar presntacion para el cliente", "Media"));


            Collections.sort(listaTareas, Comparator.comparing(tarea -> tarea.prioridad));

            for (Tarea tarea : listaTareas) {
                System.out.println(tarea);
            }

        }

    }
}
