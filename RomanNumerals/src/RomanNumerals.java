import java.util.HashMap;

public class RomanNumerals {

    private HashMap<Integer, String> numerals;

    public RomanNumerals() {
        this.numerals = new HashMap<>();

        numerals.put(1, "I");
        numerals.put(4, "IV");
        numerals.put(5, "V");
        numerals.put(9, "IX");
        numerals.put(10, "X");
        numerals.put(40, "XL");
        numerals.put(50, "L");
    }

    public String convert(int arabic) {

        String roman = "";

        if(arabic >= 50) {
            arabic -= 50;
            roman += numerals.get(50);
        }

        if(arabic >= 40) {
            arabic -= 40;
            roman += numerals.get(40);
        }

        if(arabic >= 10) {
            arabic -= 10;
            roman += numerals.get(10);
        }

        if(arabic == 9) {
            arabic -= 9;
            roman += numerals.get(9);
        }

        if(arabic >= 5) {
            arabic -= 5;
            roman += numerals.get(5);
        }

        if(arabic == 4) {
            arabic -= 4;
            roman += numerals.get(4);
        }

        if(arabic > 0 && arabic <= 3)
            roman = getOnes(arabic, roman);

        return roman;
    }

    private String getOnes(int i, String roman) {
        roman = roman + new String(new char[i]).replace("\0", numerals.get(1));
        return roman;
    }
}
