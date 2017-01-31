import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RomanNumerals {

    public static String convert(int i) {

        if(i == 5)
            return "V";

        if(i == 4)
            return "IV";

        if(i > 0 && i <= 3)
            return new String(new char[i]).replace("\0", "I");

        return "";
    }
}
