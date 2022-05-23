package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestScoresTest {
    
    @DisplayName ("Test TestScoresMeth()")
    @Test
    void TestScores() {
        assertEquals("Your grade is a 'B', huh? Most people would say that 'B' stands for 'Be better'...and they would be right.", TestScores.testScore(85));
        assertEquals("That's a pretty big 'F' if I've ever seen one. I always wondered why we skip 'E' for grading. ", TestScores.testScore(55));
    }
}
