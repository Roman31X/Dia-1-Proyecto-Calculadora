package com.example.modelo;

import java.util.List;

public class CalculoMatematico implements OperacionesMatematicas{
    protected int resultado = 0;
    @Override
    public int suma(List<Integer> valores) {
        for (int valor : valores) {
            resultado += valor;
        }
        return resultado;
    }

    @Override
    public int resta(List<Integer> valores) {
        for (int valor : valores) {
            resultado -= valor;
        }
        return resultado;
    }

    @Override
    public int multiplicacion(List<Integer> valores) {
        for (int valor : valores) {
            resultado *= valor;
        }
        return resultado;
    }

    @Override
    public double division(List<Integer> valores) {
        for (int valor : valores) {
            if(valor != 0){
                resultado /= valor;
            }else{
                System.out.println("No se puede dividir entre [0]");
                break;
            }
        }
        return resultado = 0;
    }
}
