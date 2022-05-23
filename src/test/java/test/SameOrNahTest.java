package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SameOrNahTest {
    
    @DisplayName("Test SameOrNahMeth()")
    @Test
    void SameOrNah() {
        assertEquals("They're the same word. Imagine that", SameOrNah.sameWord("Golly", "Golly"));
        assertEquals("They're different words. What a wonder of the world.", SameOrNah.sameWord("Golly", "Gosh"));
    }
}
