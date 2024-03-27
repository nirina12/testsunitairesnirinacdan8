/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package mg.inclusiv.cdan008;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Inclusiv Academy
 */
public class CalculatriceTest {

    @Test
    public void testAddition() {
        assertEquals(5, Calculatrice.addition(2, 3));
        assertEquals(1, Calculatrice.addition(-2, 3));
        assertEquals(2, Calculatrice.addition(2, 0));

    }

    @Test
    public void testSoustraction() {
        assertEquals(2, Calculatrice.soustraction(5, 3));
        assertEquals(-5, Calculatrice.soustraction(-2, 3));
        assertEquals(2, Calculatrice.soustraction(2, 0));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, Calculatrice.multiplication(2, 3));
        assertEquals(-6, Calculatrice.multiplication(-2, 3));
        assertEquals(0, Calculatrice.multiplication(2, 0));
    }

    @Test
    public void testDivision() {
        assertEquals(2, Calculatrice.division(6, 3));
        assertEquals(-2, Calculatrice.division(-6, 3));
        assertEquals(0, Calculatrice.division(0, 2));
        try{
            Calculatrice.division(6, 0);
            fail("Expected an IllegalArgumentException to be thrown");
        }catch(IllegalArgumentException e){
            assertEquals("Division par zéro impossible",e.getMessage());
        }


    }

}
