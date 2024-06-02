package com.example.controlador;

import com.example.modelo.CalculoMatematico;
import java.util.List;
import java.util.Scanner;
import static com.example.vista.MenuOpciones.mensajeRespuesta;
import static com.example.vista.MenuOpciones.valoresAB;

public class ControladorOpciones {

    protected static CalculoMatematico operacionesMatematica = new CalculoMatematico();

    public static boolean opcionOperacion(int opcion, int tipo, Scanner consola){
        List<Integer> valoresEnteros;
        List<Double> valoresDecimales;
        switch (opcion){
            case 1 -> {
                valoresEnteros = valoresAB(consola);
                var respuestaSuma = operacionesMatematica.suma(valoresEnteros);
                mensajeRespuesta(opcion,respuestaSuma);
            }
            case 2 -> {
                valoresEnteros = valoresAB(consola);
                var respuestaResta = operacionesMatematica.resta(valoresEnteros);
                mensajeRespuesta(opcion,respuestaResta);
            }
            case 3 -> {
                valoresEnteros = valoresAB(consola);
                var respuestaMultiplicacion = operacionesMatematica.multiplicacion(valoresEnteros);
                mensajeRespuesta(opcion,respuestaMultiplicacion);
            }
            case 4 -> {
                valoresEnteros = valoresAB(consola);
                var respuestaDivision = operacionesMatematica.division(valoresEnteros);
                mensajeRespuesta(opcion, respuestaDivision);
            }
            case 5 -> {
                return true;
            }
            default ->
                System.out.println("La opción ingresada esta fuera del menú: "+opcion);
        }
        return false;
    }
}
