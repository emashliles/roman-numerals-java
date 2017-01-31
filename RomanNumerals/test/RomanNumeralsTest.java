import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    private RomanNumerals converter;

    @BeforeEach
    void setUp() {
        converter = new RomanNumerals();
    }

    @Test
    void converts0(){
        assertEquals("", converter.convert(0));
    }

    @Test
    void converts1() {
        assertEquals(converter.convert(1), "I");
    }

    @Test
    void converts2() {
        assertEquals(converter.convert(2), "II");
    }

    @Test
    void converts3() {
        assertEquals(converter.convert(3), "III");
    }

    @Test
    void converts4() {
        assertEquals(converter.convert(4), "IV");
    }

    @Test
    void converts5() {
        assertEquals(converter.convert(5), "V");
    }

    @Test
    void converts6() {
        assertEquals(converter.convert(6), "VI");
    }

    @Test
    void converts7() {
        assertEquals(converter.convert(7), "VII");
    }

    @Test
    void converts9() {
        assertEquals(converter.convert(9), "IX");
    }

    @Test
    void converts10() {
        assertEquals(converter.convert(10), "X");
    }

    @Test
    void converts11() {
        assertEquals(converter.convert(11), "XI");
    }
}