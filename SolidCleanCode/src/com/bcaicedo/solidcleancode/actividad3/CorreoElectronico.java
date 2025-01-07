package com.bcaicedo.solidcleancode.actividad3;

public class CorreoElectronico implements MetodoNotificacion {

    @Override

    public void enviarNotificacion (String mensaje) {

// Lógica para enviar notificación por correo electrónico

        System.out.println("Enviando correo electrónico: " + mensaje);

    }

}

