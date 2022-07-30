/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solucion;

/**
 *
 * @author Ing_Puello
 */
public class PrimeraParte {

   /*
    
    Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.  
    */
    
    public void funcion(int a,int b, int c){
        int suma=0; 
        suma+=a+b+c;
        System.out.println("suma="+suma);
    }
    public static void main(String[] args) {
        PrimeraParte funcion = new PrimeraParte();
            funcion.funcion(2,3,4);
        
        
        
    }
    
}
