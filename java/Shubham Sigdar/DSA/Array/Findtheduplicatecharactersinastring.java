package DSA.Array;

//In this program, we need to find the duplicate characters in the string.
//string1 = "Great responsibility"
public class Findtheduplicatecharactersinastring {
    public static void main(String[] args) {
        String str = "Great reeea";
        char[] str1 = str.toCharArray();
        int count=0;
        for (int i = 0; i < str1.length; i++) {
            count=1;
            for (int j = i+1; j < str1.length; j++) {
                if(str1[i] == str1[j] && str1[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    str1[j] = '0';
                }
            }
            if (count>1 && str1[i]!='0'){
                System.out.println(str1[i]);
            }
        }
    }
}
