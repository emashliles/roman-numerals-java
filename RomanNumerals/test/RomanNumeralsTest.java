import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    public void converts0(){
        String roman = RomanNumerals.convert(0);
        assertEquals("", roman);
    }

    @Test
    void converts1() {
        assertEquals("I",RomanNumerals.convert(1));
    }

    @Test
    void converts2() {
        assertEquals("II", RomanNumerals.convert(2));
    }

    @Test
    void converts3() {
        assertEquals("III", RomanNumerals.convert(3));
    }

    @Test
    void converts4() {
        assertEquals("IV", RomanNumerals.convert(4));
    }

    @Test
    void converts5() {
        assertEquals("V", RomanNumerals.convert(5));
    }

    @Test
    void converts6() {
        assertEquals("VI", RomanNumerals.convert(6));
    }

    @Test
    void converts9() {
        assertEquals("IX", RomanNumerals.convert(9));
    }

    @Test
    void converts10() {
        assertEquals("X", RomanNumerals.convert(10));
    }

    @Test
    void converts14() {
        assertEquals("XIV", RomanNumerals.convert(14));
    }

    @Test
    void converts50() {
        assertEquals("L", RomanNumerals.convert(50));
    }

    @Test
    void converts100() {
        assertEquals("C", RomanNumerals.convert(100));
    }
}