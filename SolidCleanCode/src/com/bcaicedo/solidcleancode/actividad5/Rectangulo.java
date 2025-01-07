package com.bcaicedo.solidcleancode.actividad5;

public class Rectangulo extends Figura {
    @Override
    public int calcularArea() {
        return ancho * altura;
    }
}