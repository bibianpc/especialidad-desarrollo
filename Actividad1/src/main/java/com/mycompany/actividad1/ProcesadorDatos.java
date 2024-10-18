/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividad1;

/**
 *
 * @author BCAICEDO
 
public class CalcularDatos {
    public void calcular(int x,  int y, int [] datos){
        for (int i=0; i < datos.length; i++){
            if (datos[i]) > x && datos[i] < y){
            datos[i] = datos[i] * 2 - 1;
            }
            else if (datos[i] < x){
                    datos[i] = Math.abs(datos[i] + x);
                    }
            else {
                    datos[i] = (int) Math.pow(datos[i],y);
                    }
        }
    }
}

• Analizar el método proporcionado en el código.
• Identificar la complejidad, nombres inadecuados y parámetros mal
nombrados.
• Aplicar la refactorización necesaria para mejorar la claridad y
responsabilidad del método.
• Asegurarse de que el método modificado conserve su
funcionalidad original.
 */



public class ProcesadorDatos {
    
    // Recorre todo el arreglo y procesa cada valor individual

    public void procesarDatos (int limiteSuperior, int limiteInferior, int[] datos) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = procesarDatoIndividual(datos[i], limiteSuperior, limiteInferior);
        }
    }
    
    //Procesa un unico valor segun su comparacion con los limites

    private int procesarDatoIndividual(int valor, int limiteSuperior, int limiteInferior) {
        if (estaDentroDelRango(valor, limiteSuperior, limiteInferior)) {
            return transformarValor(valor);
        } else if (estaPorDebajoDelLimiteInferior(valor, limiteInferior)) {
            return transformarLimiteInferior(valor, limiteInferior);
        } else {
            return transformarLimiteSuperior(valor, limiteSuperior);
        }
    }

    private boolean estaDentroDelRango(int valor, int limiteInferior, int limiteSuperior) {
        //Valida si el valor está entre los limites inferior y superior
        return valor > limiteInferior && valor < limiteSuperior;
    }

    private boolean estaPorDebajoDelLimiteInferior(int valor, int limiteInferior) {
        //Valida si el valor está por debajo del límite inferior
        return valor < limiteInferior;
    }

    private int transformarValor(int valor) {
        // Multiplica el valor por 2 y le resta 1
        return valor * 2 - 1;
    }

    private int transformarLimiteInferior(int valor, int limiteInferior) {
         // Obtiene el valor absoluto de la suma del valor y el límite inferior
        return Math.abs(valor + limiteInferior);
    }

    private int transformarLimiteSuperior(int valor, int limiteSuperior) {
        // Eleva el valor a la potencia del límite superior
        return (int) Math.pow(valor, limiteSuperior);
    }
}
