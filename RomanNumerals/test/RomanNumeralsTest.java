import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {

    @Test
    public void Converts0(){
        String roman = RomanNumerals.convert(0);
        assertEquals("", roman);
    }

}