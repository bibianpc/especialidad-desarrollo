/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad1;

/**
 *
 * @author BCAICEDO

public class Empleado {
    public String nombre;
    public int edad;
    
    public Empleado(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}

private void calcularAumento Salario(double porcentaje){
//....

}
* Actividad 2
Comprender el codigo e identificar las malas prácticas
Recordar reglas de encapculamiento

//RESPUESTA
//Los atributos de la clase deben ser private para garantiar que solo sean usados por la clase que los contiene y a las que realmente se les brinde acceso de consulta
Se deben crear Setters and Geterres para poder llamar estas variables privadas desde otras clases diferentes

*/

public class Empleado {
    private String nombre;
    private int edad;
    
    public Empleado(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}

//private void calcularAumento Salario(double porcentaje){


public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
