package com.example.calculadoraapp;

import java.util.Scanner;
import static com.example.controlador.ControladorOpciones.opcionOperacion;
import static com.example.vista.MenuOpciones.*;

public class CalculadoraApp {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir){
            try{
                var opcion = menu(consola);
                var tipo = opcionEnteroDecimal(consola);
                salir = opcionOperacion(opcion, tipo, consola);
            }catch (Exception e){
                System.out.println("Error al digitar una opción fuera del menú: "+e.getMessage());
            }
        }
    }
}
