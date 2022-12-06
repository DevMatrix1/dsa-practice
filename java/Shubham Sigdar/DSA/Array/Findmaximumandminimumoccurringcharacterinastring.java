package DSA.Array;

//String str = "grass is greener on the other side"
public class Findmaximumandminimumoccurringcharacterinastring {
    public static void main(String[] args) {
        int min,max;
        String str="gra greeeee";
        char minChar=str.charAt(0);
        char maxChar=str.charAt(0);
        int[] count = new int[str.length()];
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
//            count[i]=1;
            for (int j = i+1; j < str.length(); j++) {
                if (ch[i]==ch[j] && ch[i]!=' ' && ch[i]!='0'){
                    count[i]++;
                    ch[j]='0';
                }
            }
        }
        min = max = count[0];
        for(int i = 0; i <count.length; i++) {

            //If min is greater than frequency of a character
            //then, store frequency in min and corresponding character in minChar
            if(min > count[i] && count[i] != '0') {
                min = count[i];
                minChar = ch[i];
            }
            //If max is less than frequency of a character
            //then, store frequency in max and corresponding character in maxChar
            if(max < count[i]) {
                max = count[i];
                maxChar = ch[i];
            }
        }
        System.out.println(minChar);
        System.out.println(maxChar);

    }
}
