package com.bcaicedo.solidcleancode.actividad4;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado (double lado) {
        this. lado = lado;

    }

    @Override
    double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    double calcularPerimetro() {
        return 4* lado;
    }
}
