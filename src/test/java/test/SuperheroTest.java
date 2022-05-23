package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuperheroTest {
    
    @DisplayName ("Test SuperheroMeth()")
    @Test
    void Superhero() {
        assertEquals("Little is known about the origins of Doug Dimmadome nor their true identity behind their persona. " + 
        "Some speculate that a terrible accident happened in a research facilitity, causing Doug Dimmadome to aquire their signature ability to wear tall hats.", Superhero.heroStory("Doug Dimmadome", "wear tall hats"));
    }
}
