import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class RomanNumerals {

    public static String convert(int i) {
        if(i == 1)
            return "I";
        if(i == 2)
            return "II";
       if(i == 3)
           return  "III";

        return "";
    }
}
