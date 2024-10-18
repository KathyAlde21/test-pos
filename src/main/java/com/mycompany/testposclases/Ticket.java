package com.mycompany.testposclases;

public class Ticket {
    private String nombreCompleto;
    private double montoTotal;
    private double montoPorCuota;
    
    public Ticket(){};

    public Ticket(
            String nombreCompleto,
            double montoTotal,
            double montoPorCuota
    ) {
        this.nombreCompleto = nombreCompleto;
        this.montoTotal = montoTotal;
        this.montoPorCuota = montoPorCuota;
    }

    //------------------------
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public double getMontoPorCuota() {
        return montoPorCuota;
    }

    public void setMontoPorCuota(double montoPorCuota) {
        this.montoPorCuota = montoPorCuota;
    }

    //--------------------------
    //METODOS
    
    @Override
    public String toString() {
        return "Ticket{" + "nombreCompleto=" + nombreCompleto + ", montoTotal=" + montoTotal + ", montoPorCuota=" + montoPorCuota + '}';
    }
}
