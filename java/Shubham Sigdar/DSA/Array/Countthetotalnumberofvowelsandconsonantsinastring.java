package DSA.Array;

public class Countthetotalnumberofvowelsandconsonantsinastring {
    public static void main(String[] args) {
        int vowelCount=0;
        int consonentCount=0;
        String s = "This is a really simple sentence";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
                vowelCount++;
            }else if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                consonentCount++;
            }
        }
        System.out.println(vowelCount);
        System.out.println(consonentCount);
    }
}
