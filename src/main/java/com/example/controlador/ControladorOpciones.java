package com.example.controlador;

import com.example.modelo.CalculoMatematico;
import java.util.List;
import java.util.Scanner;
import static com.example.vista.MenuOpciones.mensajeRespuesta;
import static com.example.vista.MenuOpciones.valoresAB;

public class ControladorOpciones {

    protected static CalculoMatematico operacionesMatematica = new CalculoMatematico();

    public static boolean opcionOperacion(int opcion, Scanner consola){
        List<Integer> valores;
        switch (opcion){
            case 1 -> {
                valores = valoresAB(consola);
                var respuestaSuma = operacionesMatematica.suma(valores);
                mensajeRespuesta(opcion,respuestaSuma);
            }
            case 2 -> {
                valores = valoresAB(consola);
                var respuestaResta = operacionesMatematica.resta(valores);
                mensajeRespuesta(opcion,respuestaResta);
            }
            case 3 -> {
                valores = valoresAB(consola);
                var respuestaMultiplicacion = operacionesMatematica.multiplicacion(valores);
                mensajeRespuesta(opcion,respuestaMultiplicacion);
            }
            case 4 -> {
                valores = valoresAB(consola);
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
