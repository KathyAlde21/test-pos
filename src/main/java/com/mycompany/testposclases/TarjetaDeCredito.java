package com.mycompany.testposclases;

public class TarjetaDeCredito {
    private String entidadBancaria;
    private EntidadFinanciera entidadFinanciera;
    private String numeroTarjeta;
    private double saldo;
    private Persona titular;

    public TarjetaDeCredito (){};

    public TarjetaDeCredito(
            String entidadBancaria,
            EntidadFinanciera entidadFinanciera,
            String numeroTarjeta,
            double saldo,
            Persona titular
    ) {
        this.entidadBancaria = entidadBancaria;
        this.entidadFinanciera = entidadFinanciera;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
        this.titular = titular;
    }

   //------------------------------

    public String getEntidadBancaria() {
        return entidadBancaria;
    }

    public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }

    public EntidadFinanciera getEntidadFinanciera() {
        return entidadFinanciera;
    }

    public void setEntidadFinanciera(EntidadFinanciera entidadFinanciera) {
        this.entidadFinanciera = entidadFinanciera;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    //---------------------------
    //METODOS => es lo que voy a probar en los test
    
    public String nombreCompleto() {
        return titular.getNombre() + " " + titular.getApellido();
    }
    
    public boolean tieneSaldo(double monto){
        return this.getSaldo() >= monto;
    }
    
    public void descontarSaldo(double monto){
        this.saldo-= monto; 
    }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" 
                + "entidadBancaria=" + entidadBancaria 
                + ", entidadFinanciera=" + entidadFinanciera 
                + ", numeroTarjeta=" + numeroTarjeta 
                + ", saldo=" + saldo 
                + ", titular=" + titular 
                + '}';
    }
}
