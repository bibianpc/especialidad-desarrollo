package com.mycompany.actividad3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CargarArchivo {
    public static void main(String[] args) {
        String archivo = "estudiantes.csv";

        try (BufferedReader br = new BufferedReader(new FileReader("src/com/mycompany/actividad3/" + archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                // Procesar los datos segun las necesidades del caso
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                double promedio = Double.parseDouble(datos[2]);

                // Realizar operaciones adicionales...
                System.out.println("Nombre: " + nombre + ", edad: " + edad + ", promedio: " + promedio);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
