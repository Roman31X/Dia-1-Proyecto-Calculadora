package com.example.calculadoraapp;

import java.util.Scanner;
import static com.example.controlador.ControladorOpciones.*;
import static com.example.vista.MenuOpciones.*;

public class CalculadoraApp {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir){
            try{
                var opcion = menu(consola);
                if(opcion == 5){
                    salir = true;
                }else{
                    var tipo = opcionEnteroDecimal(consola);
                    if(tipo == 1){
                        salir = opcionOperacionEntera(opcion, consola);
                    }else{
                        salir = opcionOperacionDecimal(opcion, consola);
                    }
                }
            }catch (Exception e){
                System.out.println("Error al digitar una opción o valor fuera del menú: "+e.getMessage());
            }
        }
    }
}
