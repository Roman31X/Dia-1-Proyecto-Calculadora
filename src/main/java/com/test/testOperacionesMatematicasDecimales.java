package com.test;

import com.example.modelo.CalculoMatematico;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class testOperacionesMatematicasDecimales {

    public static final CalculoMatematico operacion = new CalculoMatematico();
    public final List<Double> valorDecimal = new ArrayList<Double>();

    //Test para operaciones de números decimales
    @Test
    public void pruebaSumaDecimales(){
        valorDecimal.add(5.0);
        valorDecimal.add(5.0);
        assertEquals(10.0, operacion.sumaDecimal(valorDecimal),0.0);
    }

    @Test
    public void pruebaRestaDecimales(){
        valorDecimal.add(5.0);
        valorDecimal.add(4.0);
        assertEquals(1.0, operacion.restaDecimal(valorDecimal),0.0);
    }

    @Test
    public void pruebaMultiplicacionDecimales(){
        valorDecimal.add(5.0);
        valorDecimal.add(5.0);
        assertEquals(25.0, operacion.multiplicacionDecimal(valorDecimal),0.0);
    }

    @Test
    public void pruebaDivisionDecimales(){
        valorDecimal.add(10.0);
        valorDecimal.add(5.0);
        assertEquals(2.0, operacion.divisionDecimal(valorDecimal),0.0);
    }
}
