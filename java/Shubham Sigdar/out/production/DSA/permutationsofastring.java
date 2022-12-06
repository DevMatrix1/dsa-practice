// package DSA.Array;

public class permutationsofastring {
    public static void main(String[] args) {
        String str = "ABC";
        findPermutaion(str,"");
    }

    static void findPermutaion(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String NewStr=str.substring(0,i)+str.substring(i+1);
            findPermutaion(NewStr,ch+ans);
        }
    }
}
