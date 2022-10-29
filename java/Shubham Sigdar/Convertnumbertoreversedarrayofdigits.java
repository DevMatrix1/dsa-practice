//Convert number to reversed array of digits
//        Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
//
//        Example(Input => Output):
//        35231 => [1,3,2,5,3]
//        0 => [0]
public class Convertnumbertoreversedarrayofdigits {
    public static int[] digitize(long n) {
        // Code here
        //convert number to string
        String s=String.valueOf(n);
        //create an array
        int[] x = new int[s.length()];
        for(int i=0;i<s.length();i++){
            //'0'=>48 //'1'=>49
            x[i]=(int)(s.charAt(s.length()-i-1))-48;
        }
        return x;
    }
}
