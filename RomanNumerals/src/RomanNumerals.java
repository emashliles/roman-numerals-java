public class RomanNumerals {

    public String convert(int arabic) {

        String roman = "";

        if(arabic > 10 || arabic == 10) {
            arabic -= 10;
            roman = "X";
        }

        if(arabic == 9) {
            arabic -= 9;
            roman += "IX";
        }

        if(arabic > 5 || arabic == 5) {
            arabic -= 5;
            roman = "V";
        }

        if(arabic == 4) {
            arabic -= 4;
            roman += "IV";
        }

        if(arabic > 0 && arabic <= 3)
            roman = getOnes(arabic, roman);

        return roman;
    }

    private String getOnes(int i, String roman) {
        roman = roman + new String(new char[i]).replace("\0", "I");
        return roman;
    }
}
