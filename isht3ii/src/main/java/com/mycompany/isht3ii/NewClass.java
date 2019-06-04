/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii;

/**
 *
 * @author chex
 */
public class NewClass {
     public static void main(String args[]){
        String palabra = null;
        
        System.out.println("Prueba 1=" + (palabra) + " Resultado: " + evaluate(palabra));
        
        palabra = "aviva";
         System.out.println("Prueba 2=" + (palabra) + " Resultado: " + evaluate(palabra));
        
        palabra = "oro";
        System.out.println("Prueba 3=" + (palabra) + " Resultado: " + evaluate(palabra));
        
        palabra = "oruro";
        System.out.println("Prueba 4=" + (palabra) + " Resultado: " + evaluate(palabra));

        palabra = "salas";
        System.out.println("Prueba 5=" + (palabra) + " Resultado: " + evaluate(palabra));
        
        palabra = "yo hago yoga hoy";
        System.out.println("Prueba 6=" + (palabra) + " Resultado: " + evaluate(palabra));

        palabra = "no traces en ese carton";
        System.out.println("Prueba 7=" + (palabra) + " Resultado: " + evaluate(palabra));
        
        palabra = "5445";
        System.out.println("Prueba 8=" + (palabra) + " Resultado: " + evaluate(palabra));
        
        palabra = "|(*-*(|";
        System.out.println("Prueba 9=" + (palabra) + " Resultado: " + evaluate(palabra));
        
        palabra = "luz azul";
        System.out.println("Prueba 10=" + (palabra) + " Resultado: " + evaluate(palabra));


    }
    
    public static boolean evaluate(String word) {
    if (word == null) 
      return false;
    
    boolean result = true;
    word = word.replace(" ", "");
    int length = word.length();
    
    
    for (int i = 0; i < length / 2; i++) {
      if (word.charAt(i) != word.charAt(length - 1 - i)) {
        result = false;
        break;
      }
    }
    return result;
} 
}
