package DSA.Array;

public class Findthefrequencyofcharacters {
    public static void main(String[] args) {
        String str = "picture perfect";


        int[] count=new int[str.length()];
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            count[i]=1;
            for (int j = i+1; j <str.length() ; j++) {
                if (ch[i]==ch[j]) {
                    count[i]++;
                    ch[j]='0';
                }
            }
        }
        for(int i = 0; i <count.length; i++) {
            if(ch[i] != ' ' && ch[i] != '0')
                System.out.println(ch[i] + "-" + count[i]);
        }
    }
}
