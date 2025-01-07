package com.bcaicedo.solidcleancode.actividad3;

public class NotificacionPush implements MetodoNotificacion {

    @Override

    public void enviarNotificacion (String mensaje) {

// Lógica para enviar notificación push

        System.out.println("Enviando notificación push: " + mensaje);

    }

}

