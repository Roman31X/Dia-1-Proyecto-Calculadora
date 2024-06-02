package com.example.modelo;

import java.util.List;

public interface OperacionesMatematicas {

    int suma(List<Integer> valores);

    int resta(List<Integer> valores);

    int multiplicacion(List<Integer> valores);

    int division(List<Integer> valores);

    double sumaDecimal(List<Double> valores);

    double restaDecimal(List<Double> valores);

    double multiplicacionDecimal(List<Double> valores);

    double divisionDecimal(List<Double> valores);

}
