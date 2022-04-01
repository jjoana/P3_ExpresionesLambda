/*
Copyright [2022] [Jesús Joana Azuara]
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
		You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.06 
    Unless required by applicable law or agreed to in writing, software
    distributed Jesús Joana Azuarastributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
	  limitations under the Licene.
*/
package com.P3Lambda;
import java.util.*;
/** 
 * Clase que contiene el metodo main y donde introduciremos la expresion lambda.
 * 
*/
public class Principal {

    /**
     * Este metodo requiere al usuario que introduzca el numero de veces para calcular el numero pi
     * 
     * Una descripcion del Metodo de Montecarlo podemos encontrarla en el siguiente enlace:
     * {@link https://es.wikipedia.org/wiki/M%C3%A9todo_de_Montecarlo}
     */
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
