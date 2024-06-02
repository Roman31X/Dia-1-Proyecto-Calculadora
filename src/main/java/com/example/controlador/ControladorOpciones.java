package com.example.controlador;

import com.example.modelo.CalculoMatematico;
import java.util.List;
import java.util.Scanner;

import static com.example.vista.MenuOpciones.*;

public class ControladorOpciones {

    protected static CalculoMatematico operacionesMatematica = new CalculoMatematico();

    public static boolean opcionOperacionEntera(int opcion, Scanner consola){
        List<Integer> valoresEnteros;
        switch (opcion){
            case 1 -> {
                valoresEnteros = valoresABEnteros(consola);
                var respuestaSuma = operacionesMatematica.suma(valoresEnteros);
                mensajeRespuestaEntero(opcion,respuestaSuma);
            }
            case 2 -> {
                valoresEnteros = valoresABEnteros(consola);
                var respuestaResta = operacionesMatematica.resta(valoresEnteros);
                mensajeRespuestaEntero(opcion,respuestaResta);
            }
            case 3 -> {
                valoresEnteros = valoresABEnteros(consola);
                var respuestaMultiplicacion = operacionesMatematica.multiplicacion(valoresEnteros);
                mensajeRespuestaEntero(opcion,respuestaMultiplicacion);
            }
            case 4 -> {
                valoresEnteros = valoresABEnteros(consola);
                var respuestaDivision = operacionesMatematica.division(valoresEnteros);
                mensajeRespuestaEntero(opcion, respuestaDivision);
            }
            case 5 -> {
                return true;
            }
            default ->
                System.out.println("La opción ingresada esta fuera del menú: "+opcion);
        }
        return false;
    }

    public static boolean opcionOperacionDecimal(int opcion, Scanner consola){
        List<Double> valoresDecimales;
        switch (opcion){
            case 1 -> {
                valoresDecimales = valoresABDecimales(consola);
                var respuestaSuma = operacionesMatematica.sumaDecimal(valoresDecimales);
                mensajeRespuestaDecimal(opcion,respuestaSuma);
            }
            case 2 -> {
                valoresDecimales = valoresABDecimales(consola);
                var respuestaResta = operacionesMatematica.restaDecimal(valoresDecimales);
                mensajeRespuestaDecimal(opcion,respuestaResta);
            }
            case 3 -> {
                valoresDecimales = valoresABDecimales(consola);
                var respuestaMultiplicacion = operacionesMatematica.multiplicacionDecimal(valoresDecimales);
                mensajeRespuestaDecimal(opcion,respuestaMultiplicacion);
            }
            case 4 -> {
                valoresDecimales = valoresABDecimales(consola);
                var respuestaDivision = operacionesMatematica.divisionDecimal(valoresDecimales);
                mensajeRespuestaDecimal(opcion, respuestaDivision);
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
