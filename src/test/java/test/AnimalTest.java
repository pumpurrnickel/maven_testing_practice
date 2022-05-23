package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    
    @DisplayName ("Test AnimalMeth()")
    @Test
    void Animal() {
        Animal animal = new Animal("Eggdog", true);
        assertEquals("Eggdog", animal.getName());
        assertEquals(true, animal.getDog());
    }
    
}
