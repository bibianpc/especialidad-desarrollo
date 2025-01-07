package com.bcaicedo.solidcleancode.actividad1b;


/*

//Gestor de Empleados (responsabilidad: gestión de empleados)

public class GestorEmpleado {

public void agregarEmpleado(String nombre) {

// Lógica para agregar un nuevo empleado a la base de datos System.out.println("Empleado agregado: " + nombre);

}

}

 */


// Clase principal para mostrar el uso

public class Principal {

    public static void main(String[] args) {

        // Uso de las clases refactorizadas

        GestorEmpleado gestor = new GestorEmpleado();

        gestor.agregarEmpleado("Juan");

        GeneradorInformeEmpleados generadorInforme = new GeneradorInformeEmpleados();

        generadorInforme.generarInformeEmpleados();


    }

}




