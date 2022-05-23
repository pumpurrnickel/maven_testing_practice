package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksOOPTest {
    
    @DisplayName ("Test BooksMeth()")
    @Test
    void Books() {
        BooksOOP book = new BooksOOP("Bonk", 290, 1980);
        assertEquals("Bonk", book.getTitle());
        assertEquals(290, book.getPage());
        assertEquals(1980, book.getPub());
    }
}
