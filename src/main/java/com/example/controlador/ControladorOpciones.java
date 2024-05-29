package com.example.controlador;

import java.util.List;

public class ControladorOpciones {
    public static boolean opcionOperacion(int opcion,List<Integer> valores){
        switch (opcion){
            case 1 -> {

            }
            case 5 -> {
                return true;
            }
            default -> {
                System.out.println("La opción ingresada esta fuera del menú: "+opcion);
            }
        }
        return false;
    }
}
