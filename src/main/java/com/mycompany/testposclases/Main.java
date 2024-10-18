package com.mycompany.testposclases;

public class Main {
    public static void main(String[] args) {
     //   System.out.println("Hola Mundo");
        
         Pos maquinaPos = new Pos() ;
       
        Persona titular1 = new Persona(
               123456789, 
               "Tom", 
               "Shelby", 
               "56998248590", 
               "tomas@gmail.com");
       
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito (
                "Banco de Chile", 
                EntidadFinanciera.MASTERCARD, 
                "12346567676", 
                150000, 
                titular1);
        
        System.out.println("TARJETA ANTES DE SER USADA");
        System.out.println(tarjeta1);
        System.out.println("-------------------------------");
        System.out.println(" ");
        
        //TICKET DE PAGO
        System.out.println("GENERANDO TICKET...");
        Ticket ticketDePago = maquinaPos.efectuarPago(
                tarjeta1, 
                100000,
                5);
        System.out.println(ticketDePago);
        
        System.out.println("-------------------------------");
        System.out.println(" ");
        System.out.println("TARJETA DESPUES DE SER USADA");
        System.out.println(tarjeta1);

        
    }
}



