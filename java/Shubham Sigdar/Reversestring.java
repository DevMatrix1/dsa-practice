public class Reversestring {
    public static String solution(String str) {
        // Your code here...
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        return s.toString();
      }
}
