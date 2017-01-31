import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    void converts0(){
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

    @Test
    void converts3() {
        assertEquals(RomanNumerals.convert(3), "III");
    }

    @Test
    void converts4() {
        assertEquals(RomanNumerals.convert(4), "IV");
    }

    @Test
    void converts5() {
        assertEquals(RomanNumerals.convert(5), "V");
    }

    @Test
    void converts6() {
        assertEquals(RomanNumerals.convert(6), "VI");
    }

    @Test
    void converts7() {
        assertEquals(RomanNumerals.convert(7), "VII");
    }
}