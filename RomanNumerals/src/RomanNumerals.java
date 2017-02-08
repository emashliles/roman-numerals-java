import com.sun.tools.javac.code.Scope;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    private Map<Integer, String> numerals;

    public RomanNumerals() {
        this.numerals = new LinkedHashMap<>();

        numerals.put(50, "L");
        numerals.put(40, "XL");
        numerals.put(10, "X");
        numerals.put(9, "IX");
        numerals.put(5, "V");
        numerals.put(4, "IV");
        numerals.put(1, "I");
    }

    public String convert(int arabic) {

        String roman = "";

        Iterator i = numerals.entrySet().iterator();

        for (Map.Entry KeyValuePair: numerals.entrySet()) {

            int numeral = (int) KeyValuePair.getKey();
            String value = (String) KeyValuePair.getValue();

            while (arabic >= numeral) {
                roman += value;
                arabic -= numeral;
            }
        }

        return roman;
    }

    private String getOnes(int i, String roman) {
        roman = roman + new String(new char[i]).replace("\0", numerals.get(1));
        return roman;
    }
}
