package com.P3Lambda;
import java.util.*;

public class Principal {

    public static void main (String [] args){

        ICalculadoraPi calculadoraPi = (pasos) -> {
            double dentroCirculo= 0.0;
            double dentroCuadrado=0.0;
            double AreaCuadrado= 4;
            double coordenadaX;
            double coordenadaY;
            double pi=0;
            double distancia;
    
            for (int i = 0; i < pasos; i++){
                coordenadaX = 1 -2 * Math.random();
                coordenadaY = 1 - 2 * Math.random();
                distancia = Math.sqrt(Math.pow(coordenadaX,2) + Math.pow(coordenadaY,2));
                if (distancia <= 1){
                    dentroCirculo++;
                }
                dentroCuadrado++;
            }
            pi = AreaCuadrado*(dentroCirculo/dentroCuadrado);
            return pi;
        };

        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuántos iteraciones quiere para el cálculo de pi: " );
        long pasos = entrada.nextLong();
        double valorCalculado = calculadoraPi.generarNumeroPi(pasos);
        System.out.println("El valor de Pi calculado es: " + valorCalculado);
    }   

}
