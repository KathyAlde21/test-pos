package com.mycompany.testposclases;

public class Pos {
    public final int MIN_CUOTAS = 1;
    public final int MAX_CUOTAS = 6;
    public final double RECARGO_CUOTAS = 0.03;
    
    public Ticket efectuarPago(
            TarjetaDeCredito tarjeta,
            double monto,
            int cantidadCuotas
    ) {
        double montoFinal = monto + (monto * recargoPorCuotas(cantidadCuotas));
        
        Ticket nuevoTicket = null;
        
        if (tarjeta.tieneSaldo(montoFinal)) {
            double montoPorCuota = montoFinal / cantidadCuotas;
            tarjeta.descontarSaldo(montoPorCuota);
            String cliente = tarjeta.nombreCompleto();
   
            nuevoTicket = new Ticket(
                    cliente,
                    montoFinal, 
                    montoPorCuota
            );
        }
        return nuevoTicket;
    }
    
    private double recargoPorCuotas(int cantidadCuotas) { //para saber monto
        return (cantidadCuotas - 1) * RECARGO_CUOTAS;
    }
}
