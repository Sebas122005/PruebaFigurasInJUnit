/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.pruebafigurasinjunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sebas
 */
public class RectanguloTest {
    
    public RectanguloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of area method, of class Rectangulo.
     */
    
    @Test
    public void testArea() {
        System.out.println("area");
        Rectangulo instance = new Rectangulo(8,12);
        double expResult = 96;
        double result = instance.area();
        assertEquals(expResult, result,0);
    }

    /**
     * Test of perimetro method, of class Rectangulo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        Rectangulo instance = new Rectangulo(8,12);
        double expResult = 40;
        double result = instance.perimetro();
        assertEquals(expResult,result ,0);
        
    }
    
}
