package com.example.vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOpciones {

    public static int menu(Scanner consola){
        System.out.print("|-------------------------|"+"\n"+
                         "|  Aplicación calculadora |"+"\n"+
                         "|-------------------------|"+"\n"+
                         "|  [1] - SUMA             |"+"\n"+
                         "|  [2] - RESTA            |"+"\n"+
                         "|  [3] - MULTIPLICACIÓN   |"+"\n"+
                         "|  [4] - DIVISIÓN         |"+"\n"+
                         "|  [5] - SALIR            |"+"\n"+
                         "|-------------------------|"+"\n");
        System.out.print("| Ingrese una opción =>\s");
        return Integer.parseInt(consola.nextLine());
    }

    public static int opcionEnteroDecimal(Scanner consola){
        System.out.print("|-------------------------|"+"\n"+
                         "| OPCIÓN TIPO OPERADORES  |"+"\n"+
                         "|-------------------------|"+"\n"+
                         "| [1] - ENTEROS           |"+"\n"+
                         "| [2] - DECIMALES / AMBOS |"+"\n"+
                         "|-------------------------|"+"\n");
        System.out.print("| Ingrese una opción =>\s");
        return Integer.parseInt(consola.nextLine());
    }

    public static List<Integer> valoresABEnteros(Scanner consola){
        List<Integer> operadores = new ArrayList<>();
        System.out.print("Proporciona valor operando 1: ");
        var operadorA = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona valor operando 2: ");
        var operadorB = Integer.parseInt(consola.nextLine());
        operadores.add(operadorA);
        operadores.add(operadorB);
        return operadores;
    }

    public static List<Double> valoresABDecimales(Scanner consola){
        List<Double> operadores = new ArrayList<>();
        System.out.print("Proporciona valor operando 1: ");
        var operadorA = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona valor operando 2: ");
        var operadorB = Double.parseDouble(consola.nextLine());
        operadores.add(operadorA);
        operadores.add(operadorB);
        return operadores;
    }

    public static void mensajeRespuesta(int opcion, Integer respuesta){
        switch (opcion){
            case 1 -> System.out.println("La suma de los valores es: "+respuesta);
            case 2 -> System.out.println("La resta de los valores es: "+respuesta);
            case 3 -> System.out.println("La multiplicación de los valores es: "+respuesta);
            case 4 -> System.out.println("La division de los valores es: "+respuesta);
            default -> System.out.println("Respuesta fuera de opción");
        }
    }
}
