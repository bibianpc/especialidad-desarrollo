package com.mycompany.actividad1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BCAICEDO
 */



        
public class Libro {
    
   //Atributos
    public String titulo;
    private String autor;
    private String genero;
    private int cantidadDisponible;
    
    
    //Constructor
    public Libro (String titulo, String autor, String genero, int cantidadDisponible ){
        if (titulo != null) {
            this.titulo = titulo.toUpperCase();
        }
        this.autor = autor;
        this.genero = genero;
        this.cantidadDisponible = cantidadDisponible;
        
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null) {
            this.titulo = titulo.toUpperCase();
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
       //Atributos
    
}
 
    
    
