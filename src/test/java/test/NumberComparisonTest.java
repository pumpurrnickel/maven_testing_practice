package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComparisonTest {
    
    @DisplayName ("Test NumbCompare()")
    @Test
    void NumbCompare() {
        assertEquals("12 is greater than 6", NumberComparison.Compariston(12, 6));
        assertEquals("Both numbers are equal.", NumberComparison.Compariston(12, 12));
        assertEquals("24 is less than 46", NumberComparison.Compariston(24, 46));
    }
    
}
