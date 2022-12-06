package DSA.Array;

public class ToLowerCase {
    public String toLowerCase(String s) {
        StringBuffer s1 = new StringBuffer(s);
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                s1.setCharAt(i,Character.toLowerCase(s.charAt(i)));
            }

        }
        return s1.toString();
    }
}
