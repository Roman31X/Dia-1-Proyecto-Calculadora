package com.test;

import com.example.modelo.CalculoMatematico;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testOperacionesMatematicas {

    public static final CalculoMatematico operacion = new CalculoMatematico();
    public final List<Integer> valorEntero = new ArrayList<>();
    public final List<Double> valorDecimal = new ArrayList<>();
    //Test para operaciones de números enteros

    @Test
    public void pruebaSumaEnteros(){
        valorEntero.add(5);
        valorEntero.add(5);
        assertEquals(10, operacion.suma(valorEntero));
    }

    @Test
    public void pruebaRestaEnteros(){
        valorEntero.add(5);
        valorEntero.add(4);
        assertEquals(1, operacion.resta(valorEntero));
    }

    @Test
    public void pruebaMultiplicacionEnteros(){
        valorEntero.add(5);
        valorEntero.add(5);
        assertEquals(25, operacion.multiplicacion(valorEntero));
    }

    @Test
    public void pruebaDivisionEnteros(){
        valorEntero.add(10);
        valorEntero.add(5);
        assertEquals(2, operacion.division(valorEntero));
    }
}
