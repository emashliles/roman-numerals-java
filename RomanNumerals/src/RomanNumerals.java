public class RomanNumerals {

    public String convert(int i) {

        String roman = "";

        if(i > 10 || i == 10) {
            i -= 10;
            roman = "X";
        }

        if(i == 9)
            return "IX";

        if(i > 5 || i == 5) {
            i -= 5;
            roman = "V";
        }

        if(i == 4)
            return "IV";

        if(i > 0 && i <= 3)
            roman = getOnes(i, roman);

        return roman;
    }

    private String getOnes(int i, String roman) {
        roman = roman + new String(new char[i]).replace("\0", "I");
        return roman;
    }
}
