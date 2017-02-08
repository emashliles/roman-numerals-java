import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {


    public static String convert(int arabic) {

        String roman = "";

        Map<Integer, String> conversions = new LinkedHashMap();

        conversions.put(100, "C");
        conversions.put(50, "L");
        conversions.put(10, "X");
        conversions.put(9, "IX");
        conversions.put(5, "V");
        conversions.put(4, "IV");
        conversions.put(1, "I");

        for(Map.Entry conversion : conversions.entrySet()) {

            Integer value = (Integer) conversion.getKey();
            String numeral = (String) conversion.getValue();

            while (value <= arabic) {
                roman += numeral;
                arabic -= value;
            }
        }

        return roman;
    }
}
