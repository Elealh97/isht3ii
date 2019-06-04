/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.isht3ii.NewClass;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author chex
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
      @Test
    public void ProbandoNull() {        
        //given
        boolean resEsperado = false;
        String palabra = null;
        //when
        boolean resObtenido = NewClass.evaluate(palabra);       
        //then
        assertEquals("Test 1 fallo",resEsperado, resObtenido);
    }
    
      @Test
    public void ProbandotextoImpar() {
        //given
        boolean resEsperado = true;
        String palabra = "ojo";    
        //when
        boolean resObtenido = NewClass.evaluate(palabra);
        
        //then
        assertEquals("Test 2 fallo",resEsperado, resObtenido);
    }
    
    @Test
    public void ProbandotextoPar() {
        //given
        boolean resEsperado = true;
        String palabra = "9119";       
       //when
        boolean resObtenido = NewClass.evaluate(palabra);
        
        //then
        assertEquals("Test 3 fallo",resEsperado, resObtenido);
    }
    
     @Test
    public void ProbandotextoLargo() {
        //given
        boolean resEsperado = true;
        String palabra = "alli por la tropa portado traido a ese paraje de maniobras una tipa como capitan usar boina me dejara pese a odiar toda tropa por tal ropilla";        
        //when
        boolean resObtenido = NewClass.evaluate(palabra);    
        //then
        assertEquals("Test 4 fallo",resEsperado, resObtenido);
    }
    
    @Test
    public void ProbandotextoVacio() {
        //given
        String palabra = "";
        boolean resEsperado = true;    
        //when
        boolean resObtenido = NewClass.evaluate(palabra);       
        //then
        assertEquals("Test 5 fallo",resEsperado, resObtenido);
    }
    
 
    
    @Test
    public void ProbandounaLetra() {
        //given
        boolean resEsperado = true;
        String palabra = "A";      
        //when
        boolean resObtenido = NewClass.evaluate(palabra);        
        //then
        assertEquals("Test 6 fallo",resEsperado, resObtenido);
    }
    
    @Test
    public void ProbandoSimbolos() {
        //given
        boolean resEsperado = true; 
        String palabra = "+-+";       
        //when
        boolean resObtenido = NewClass.evaluate(palabra);
        //then
        assertEquals("Test 7 fallo",resEsperado, resObtenido);
    }
    
  
    
    @Test
    public void ProbandotextoLargoSinEspacios() {
    
        //given
        String palabra = "elbaresimanozonamiserable";
        boolean resEsperado = true;
        
        //when
        boolean resObtenido = NewClass.evaluate(palabra);
        
        //then
        assertEquals("Test 8 fallo",resEsperado, resObtenido);
}
}
