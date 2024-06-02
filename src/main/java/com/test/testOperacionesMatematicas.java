package com.test;

import com.example.modelo.CalculoMatematico;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testOperacionesMatematicas {

    public static final CalculoMatematico operacion = new CalculoMatematico();
    public final List<Integer> valores = new ArrayList<>();

    @Test
    public void pruebaSumaEnteros(){
        valores.add(5);
        valores.add(5);
        assertEquals(10, operacion.suma(valores));
    }

    @Test
    public void pruebaRestaEnteros(){
        valores.add(5);
        valores.add(4);
        assertEquals(1, operacion.resta(valores));
    }

    @Test
    public void pruebaMultiplicacionEnteros(){
        valores.add(5);
        valores.add(5);
        assertEquals(25, operacion.multiplicacion(valores));
    }

    @Test
    public void pruebaDivisionEnteros(){
        valores.add(10);
        valores.add(5);
        assertEquals(2, operacion.division(valores));
    }
}
