package com.example.controlador;

import com.example.modelo.CalculoMatematico;
import com.example.modelo.OperacionesMatematicas;

import java.util.List;

import static com.example.vista.MenuOpciones.mensajeRespuesta;

public class ControladorOpciones {

    protected static CalculoMatematico operacionesMatematica = new CalculoMatematico();


    public static boolean opcionOperacion(int opcion,List<Integer> valores){
        switch (opcion){
            case 1 -> {
                var respuestaSuma = operacionesMatematica.suma(valores);
                mensajeRespuesta(opcion,respuestaSuma);
            }
            case 2 -> {
                var respuestaResta = operacionesMatematica.resta(valores);
                mensajeRespuesta(opcion,respuestaResta);
            }
            case 3 -> {
                var respuestaMultiplicacion = operacionesMatematica.multiplicacion(valores);
                mensajeRespuesta(opcion,respuestaMultiplicacion);
            }
            case 4 -> {
                var respuestaDivision = operacionesMatematica.division(valores);
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
