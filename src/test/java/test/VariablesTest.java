package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariablesTest {
    
    @DisplayName ("Test ImSoTired()")
    @Test
    void ImSoTired() {
        assertEquals("Your string is bonkers. Your interger is 16. Your double is 66.6. Your boolean is true.", Variables.output("bonkers", 16, 66.6, true));
    }
}
