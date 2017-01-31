import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    public void converts0(){
        assertEquals("", RomanNumerals.convert(0));
    }

    @Test
    void converts1() {
        assertEquals(RomanNumerals.convert(1), "I");
    }

    @Test
    void converts2() {
        assertEquals(RomanNumerals.convert(2), "II");
    }
}