package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculationsTest {
    
    @DisplayName ("Test AdditionMent()")
    @Test
    void addTest() {
        assertEquals(15, Calculations.Addition(7, 8));
    }

    @DisplayName ("Test SubtractionMnet()")
    @Test
    void subTest() {
        assertEquals(10, Calculations.Substraction(20, 10));
    }

    @DisplayName ("Test MultiplicationMeth()")
    @Test
    void multTest() {
        assertEquals(50, Calculations.Multiplication(5, 10));
    }

    @DisplayName ("Test DivisionnMeht()")
    @Test
    void DivTest() {
        assertEquals(10, Calculations.Division(100, 10));
    }

    @DisplayName ("Test ModulusMeth()")
    @Test
    void ModTest() {
        assertEquals(1, Calculations.Modulus(1, 2));
    }
}
