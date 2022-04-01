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


/**
 * Interface funcional que contiene el metodo abstracto generarNumeroPi.
 * <p>  
 * author: Jesus Joana.
 * version:1.0
 */
public interface ICalculadoraPi {
    
    /**
     * 
     * @param pasos en este parametro se especifican el numero de iteraciones (veces)
     * que se realiza el bucle iterativo.
     * @return devuelve enl numero pi de tipo doble
     */
    public double generarNumeroPi(long pasos);


}
