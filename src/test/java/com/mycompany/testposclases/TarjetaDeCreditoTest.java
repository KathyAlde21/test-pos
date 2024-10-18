package com.mycompany.testposclases;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//ACA VOY A HACER TEST A TARJETA DE CREDITO - A SUS METODOS
//los datos ingresados solo quedan aca
public class TarjetaDeCreditoTest {
    
    //en vez de poner los datos uno a uno los creo aca
    private final double SALDO = 20000;
    private final double MONTO = 10000;
    
    public static TarjetaDeCredito tarjeta;
    
    @BeforeEach
    public void setUp() {
        tarjeta = new TarjetaDeCredito();
    }
    
    //PROBANDO TRUE
    @Test
    public void testTieneSaldo(){ //parto siempre el llamado con " test "
        tarjeta.setSaldo(SALDO); //con set le envio el dato
        assertTrue(tarjeta.tieneSaldo(MONTO)); //quiero saber si el saldo es el igual
    }
    
    //PROBANDO FALSE
 /*   @Test
    public void testTieneSaldo(){ //parto siempre el llamado con " test "
        tarjeta.setSaldo(20000); //con set le envio el dato
        assertFalse(tarjeta.tieneSaldo(10000)); //quiero saber si el saldo es el igual
    }*/
    
    //------------------------------------------------------------
    @Test
    public void testDescontarSaldo(){
        tarjeta.setSaldo(SALDO);
        tarjeta.descontarSaldo(MONTO);
        
        assertEquals(
                //20000 - 10000, //es correcto
               // 20000 - 30000, //falso
                SALDO - MONTO,
                tarjeta.getSaldo(),
                "El saldo no se ha descontado correctamente"
        );
    }
    
    //-------------------------------------------------------------------
    @Test
    public void testNombreCompleto(){ //validar que el metodo sea una cadena
        tarjeta.setTitular(new Persona(
                123456780,
                "Cristobal",
                "Soto",
                "978965412",
                "cristobal@gmail.com"
            )
        );
        
        assertTrue(tarjeta.nombreCompleto() instanceof String); //validar String
        
    }
    
    //---------------------------------------------------------------------
    
    
}
