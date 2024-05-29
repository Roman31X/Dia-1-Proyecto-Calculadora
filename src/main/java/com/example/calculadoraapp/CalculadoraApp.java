package com.example.calculadoraapp;

import java.util.List;
import java.util.Scanner;

import static com.example.controlador.ControladorOpciones.opcionOperacion;
import static com.example.vista.MenuOpciones.menu;
import static com.example.vista.MenuOpciones.valoresAB;

public class CalculadoraApp {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;
        List<Integer> valores;

        while (!salir){
            try{
                var opcion = menu(consola);
                valores = valoresAB(consola);
                salir = opcionOperacion(opcion,valores);
            }catch (Exception e){
                System.out.println("Error al digitar una opcion fuera del menú: "+e.getMessage());
            }
        }
    }
}
