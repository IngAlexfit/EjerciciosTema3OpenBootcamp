/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solucion.SegundaParte;

/**
 *
 * @author Ing_Puello
 */
public class Main {

    /**
     * 

Segunda parte:

Crear una clase coche.



Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
     */
    public static void main(String[] args) {
        
        Coche miCoche = new Coche();
        
        miCoche.funcion(5);
        System.out.println("El numero de puertas que tiene el objeto es:"+miCoche.numPuertas);
        
        
        
    }
    
}
