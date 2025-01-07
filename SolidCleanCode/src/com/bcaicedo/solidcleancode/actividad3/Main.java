package com.bcaicedo.solidcleancode.actividad3;

public class Main {

    public static void main(String[] args) {

        NotificacionManager notificacionManager = new NotificacionManager();

// Agregar métodos de notificación (puedes agregar más sin modificar el código existente)

        notificacionManager.agregarMetodoNotificacion (new CorreoElectronico());

        notificacionManager.agregarMetodoNotificacion (new MensajeTexto());

        notificacionManager.agregarMetodoNotificacion (new NotificacionPush());

// Enviar una notificación global a través de todos los canales

        notificacionManager.enviarNotificacionGlobal("¡Promoción especial hoy!");

// Puedes agregar nuevos métodos de notificación sin modificar el código existente

        notificacionManager.agregarMetodoNotificacion (new MetodoNotificacionPersonalizado());

        notificacionManager.enviarNotificacionGlobal("¡Nuevo método de notificación!");

    }



}
