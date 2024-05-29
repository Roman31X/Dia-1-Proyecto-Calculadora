package com.example.vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuOpciones {
    public static int menu(Scanner consola){
        System.out.println("|-------------------------|"+"\n"+
                           "|  Aplicación calculadora |"+"\n"+
                           "|-------------------------|"+"\n"+
                           "|  [1] - SUMA             |"+"\n"+
                           "|  [2] - RESTA            |"+"\n"+
                           "|  [3] - MULTIPLICACIÓN   |"+"\n"+
                           "|  [4] - DIVISIÓN         |"+"\n"+
                           "|-------------------------|"+"\n");
        System.out.print("| Ingrese una opción =>\s");
        return Integer.parseInt(consola.nextLine());
    }

    public static List<Integer> valoresAB(Scanner consola){
        List<Integer> operadores = new ArrayList<>();
        System.out.print("Proporciona valor operando 1: ");
        var operadorA = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona valor operando 2: ");
        var operadorB = Integer.parseInt(consola.nextLine());
        operadores.add(operadorA);
        operadores.add(operadorB);
        return operadores;
    }
}
