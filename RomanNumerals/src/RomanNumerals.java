import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RomanNumerals {

    public static String convert(int i) {

        if(i > 0 && i <= 3)
            return new String(new char[i]).replace("\0", "I");

        return "";
    }
}
