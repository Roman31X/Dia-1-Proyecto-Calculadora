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
                mensajeRespuesta(opcion,respuestaSuma);
            }
            case 2 -> {
                valoresEnteros = valoresABEnteros(consola);
                var respuestaResta = operacionesMatematica.resta(valoresEnteros);
                mensajeRespuesta(opcion,respuestaResta);
            }
            case 3 -> {
                valoresEnteros = valoresABEnteros(consola);
                var respuestaMultiplicacion = operacionesMatematica.multiplicacion(valoresEnteros);
                mensajeRespuesta(opcion,respuestaMultiplicacion);
            }
            case 4 -> {
                valoresEnteros = valoresABEnteros(consola);
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

    public static boolean opcionOperacionDecimal(int opcion, Scanner consola){
        List<Double> valoresDecimales;
        switch (opcion){
            case 1 -> {
                valoresDecimales = valoresABDecimales(consola);
                var respuestaSuma = operacionesMatematica.sumaDecimal(valoresDecimales);
                mensajeRespuesta(opcion,respuestaSuma);
            }
            case 2 -> {
                valoresDecimales = valoresABDecimales(consola);
                var respuestaResta = operacionesMatematica.restaDecimal(valoresDecimales);
                mensajeRespuesta(opcion,respuestaResta);
            }
            case 3 -> {
                valoresDecimales = valoresABDecimales(consola);
                var respuestaMultiplicacion = operacionesMatematica.multiplicacionDecimal(valoresDecimales);
                mensajeRespuesta(opcion,respuestaMultiplicacion);
            }
            case 4 -> {
                valoresDecimales = valoresABDecimales(consola);
                var respuestaDivision = operacionesMatematica.divisionDecimal(valoresDecimales);
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
