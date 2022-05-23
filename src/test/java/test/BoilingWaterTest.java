package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoilingWaterTest {
    
    @DisplayName("Test IsWaterBoiling() method")
    @Test
    void IsWaterBoiling() {
        assertEquals("Water is boiling", BoilingWater.IsBoiling(214));
        assertEquals("...I said to enter a number greater than 212 :/", BoilingWater.IsBoiling(200));
    }
}
