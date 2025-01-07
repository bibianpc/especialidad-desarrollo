package com.bcaicedo.solidcleancode.actividad2c;

 /*   public void procesarPagoTarjetaCredito(TarjetaCredito tarjeta){
    //  Logica para procesar el pago con tarjeta de credito

    }


    public void procesarPagoPayPal(PayPal paypal){
        //  Logica para procesar el pago con PayPal

    }
*/

public class ProcesadorDePago {

    public void procesarPago(MetodoDePago metodoDePago){
         metodoDePago.procesarPago();

    }


}
