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
public class SistemaBiblioteca {
    public static void main(String[] args){
       
       //Constructor
       Libro primerLibro = new Libro("titulo1", "autor1", "genero1", 10);
       System.out.println("Nombre del libro 1 Inicial: " +primerLibro.getTitulo());
       primerLibro.setTitulo("La Bailarina");
       System.out.println("Nombre del libro 1: " +primerLibro.getTitulo());
       
    }
}
