public class RomanNumerals {

    public static String convert(int i) {

        String roman = "";

        if(i > 5) {
            i -= 5;
            roman = "V";
        }

        if(i == 5)
            return "V";

        if(i == 4)
            return "IV";

        if(i > 0 && i <= 3)
            roman = getOnes(i, roman);

        return roman;
    }

    private static String getOnes(int i, String roman) {
        roman = roman + new String(new char[i]).replace("\0", "I");
        return roman;
    }
}
