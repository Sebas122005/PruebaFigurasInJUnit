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
public class trianguloTest {
    
    public trianguloTest() {
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

    @Test
    public void testArea() {
        System.out.println("area");
        triangulo instance = new triangulo("ISOSCELES", 12,12, 8);
        double expResult = 72;
        double result = instance.area();
        assertEquals(expResult, result, 0);
        assertTrue(result==expResult);
        
    }

    /**
     * Test of perimetro method, of class triangulo.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        triangulo instance = new triangulo("ESCALENO", 12, 8, 6);
        double expResult = 26;
        double result = instance.perimetro();
        assertEquals(expResult, result, 0);
        assertTrue(result==expResult);
    }
    
}
