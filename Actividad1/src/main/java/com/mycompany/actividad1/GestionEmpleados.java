/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad1;

/**
 *
 * @author BCAICEDO
 */
public class GestionEmpleados {

    public static void main(String[] args){
        //Constructores
       CalculadorSalario empleado1 = new EmpleadoTiempoCompleto();
       CalculadorSalario empleado2 = new EmpleadoTiempoParcial();
       
       System.out.println("Salario empleado 1: " +empleado1.calcularSalario());
       System.out.println("Salario empleado 2: " +empleado2.calcularSalario());
       
    }
            
            
            
}
