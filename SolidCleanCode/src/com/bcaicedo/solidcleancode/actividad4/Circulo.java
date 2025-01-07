package com.bcaicedo.solidcleancode.actividad4;

public class Circulo extends FiguraGeometrica {
    private double radio;

    // Constructor

    public Circulo (double radio) {
        this.radio = radio;
    }

    // Implementación específica para círculo
    @Override
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    double calcularPerimetro() {
        return 2* Math.PI * radio;

    }

}
