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
public class EmpleadoTiempoCompleto implements CalculadorSalario {

    double salarioPorHora = 200000.0;
        
    @Override
    public double calcularSalario() {
      return salarioPorHora * 8;
      
    }
    
}
