//Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'.
// Return the resulting string.
//
//        Note: input will never be an empty string
public class FakeBinary {
    public static String fakeBin(String numberString) {
//       String[] str = numberString.split("");
        String res="";
        for(int i=0;i<numberString.length();i++){
            if(numberString.charAt(i)<'5'){
                res+="0";
            }else{
                res+="1";
            }
        }
        return res;
    }
//    final char c[] = numberString.toCharArray();
//        for (int i = 0; i < c.length; i++)
//    c[i] = c[i] < '5' ? '0' : '1';
//        return new String(c);
}
