package DSA.Array;

public class DivideastringinNequalparts {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        int n=3;
        int temp=0;
        String[] s = new String[n];
        int a = str.length() / n;
        if(str.length()%n!=0){
            System.out.println("not divide into equal part");
        }else {
            for (int i = 0; i < str.length(); i = i + a) {
               String f= str.substring(i, i + a);
               s[temp]=f;
               temp++;
            }
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
