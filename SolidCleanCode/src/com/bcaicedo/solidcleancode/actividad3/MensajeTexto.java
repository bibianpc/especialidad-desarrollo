package com.bcaicedo.solidcleancode.actividad3;

public class MensajeTexto implements MetodoNotificacion {

    @Override

    public void enviarNotificacion (String mensaje) {

        // Lógica para enviar notificación por mensaje de texto

        System.out.println("Enviando mensaje de texto: " + mensaje);

    }

}

