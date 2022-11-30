package DSA.Array;

import java.util.Arrays;
import java.util.Locale;

public class Twostringsaretheanagram {
    public static void main(String[] args) {
        String s1 = "Brag";
        String s2 = "Grab";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        if(s1.length()!=s2.length()){
            System.out.println("not a anagram");
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1,ch2)==true){
            System.out.println("anagram");
        }
    }
}
