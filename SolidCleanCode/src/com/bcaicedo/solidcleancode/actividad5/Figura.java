package com.bcaicedo.solidcleancode.actividad5;

abstract class Figura {
        protected int ancho;
        protected int altura;

        public void setDimensiones (int ancho, int altura) {
            this.ancho = ancho;
            this.altura = altura;
        }

        public abstract int calcularArea();
    }



