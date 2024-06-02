package com.example.modelo;

import java.util.List;

public class CalculoMatematico implements OperacionesMatematicas{

    //ENTEROS
    @Override
    public  int suma(List<Integer> valores) {
        int resultado = 0;
        for (int valor : valores) {
            resultado += valor;
        }
        return resultado;
    }

    @Override
    public int resta(List<Integer> valores) {
        int resultado = 0;
        resultado = valores.get(0) - valores.get(1);
        return resultado;
    }

    @Override
    public int multiplicacion(List<Integer> valores) {
        int resultado = 0;
        resultado = valores.get(0) * valores.get(1);
        return resultado;
    }

    @Override
    public int division(List<Integer> valores) {
        int resultado = 0;
        if(valores.get(0) != 0){
            resultado = valores.get(0) / valores.get(1);
        }else{
            System.out.println("No se puede dividir entre [0]");
        }
        return resultado;
    }

    //DECIMALES - AMBOS
    @Override
    public double sumaDecimal(List<Double> valores) {
        double resultado = 0;
        for (double valor : valores) {
            resultado += valor;
        }
        return resultado;
    }

    @Override
    public double restaDecimal(List<Double> valores) {
        double resultado = 0;
        resultado = valores.get(0) - valores.get(1);
        return resultado;
    }

    @Override
    public double multiplicacionDecimal(List<Double> valores) {
        double resultado = 0;
        resultado = valores.get(0) * valores.get(1);
        return resultado;
    }

    @Override
    public double divisionDecimal(List<Double> valores) {
        double resultado = 0;
        if(valores.get(0) != 0){
            resultado = valores.get(0) / valores.get(1);
        }else{
            System.out.println("No se puede dividir entre [0]");
        }
        return resultado;
    }
}
