//Write a function that accepts an integer n and a string s as parameters,
//        and returns a string of s repeated exactly n times.
//
//        Examples (input -> output)
//        6, "I"     -> "IIIIII"
//        5, "Hello" -> "HelloHelloHelloHelloHello"
public class Stringrepeat {
    public static String repeatStr(final int repeat, final String string) {
        String s = "";
        for(int i=0;i<repeat;i++){
            s=s+string;
        }
        return s;

    }
}

//return string.repeat(repeat);