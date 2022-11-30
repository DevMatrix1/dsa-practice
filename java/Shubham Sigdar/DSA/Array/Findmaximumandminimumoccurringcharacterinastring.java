package DSA.Array;

public class Findmaximumandminimumoccurringcharacterinastring {
    public static void main(String[] args) {
        String str = "Grass is greener on the other side";
        int[] freq=new int[str.length()];
        char[] newStr=str.toCharArray();
        char minChar=str.charAt(0);
        char maxChar=str.charAt(0);

        for (int i = 0; i < newStr.length; i++) {
            freq[i]=1;
            for (int j=i+1;j<newStr.length;j++){
                if(newStr[i]==newStr[j] && newStr[i]!=' ' && newStr[i]!=0 ){
                    freq[i]++;
                    newStr[j]=0;
                }
            }

        }
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(freq[i]);
            System.out.println(newStr[i]);
        }


    }
}
