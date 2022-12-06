package DSA.Array;
//You are given a string s of even length. Split this string into two halves of equal lengths,
// and let a be the first half and b be the second half.
//
//        Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
//
//        Return true if a and b are alike. Otherwise, return false.
//
//
//
//        Example 1:
//
//        Input: s = "book"
//        Output: true
//        Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
//        Example 2:
//
//        Input: s = "textbook"
//        Output: false
//        Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
//        Notice that the vowel o is counted twice.


public class DetermineifStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        char[] ch=s.toCharArray();
        StringBuffer a=new StringBuffer(s);
        StringBuffer b=new StringBuffer(s);
        for(int i=0;i<ch.length/2;i++){
            a.append(ch[i]);
        }
        for(int i=ch.length/2;i<ch.length;i++){
            b.append(ch[i]);
        }
        int aCount=0;
        int bCount=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='a' ||a.charAt(i)=='e'||a.charAt(i)=='i' ||a.charAt(i)=='o' ||a.charAt(i)=='u' ||a.charAt(i)=='A' ||a.charAt(i)=='E' ||a.charAt(i)=='I' ||a.charAt(i)=='O' ||a.charAt(i)=='U'){
                aCount++;
            }
        }
        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='a' ||b.charAt(i)=='e'||b.charAt(i)=='i' ||b.charAt(i)=='o' ||b.charAt(i)=='u' ||b.charAt(i)=='A' ||b.charAt(i)=='E' ||b.charAt(i)=='I' ||b.charAt(i)=='O' ||b.charAt(i)=='U'){
                bCount++;
            }
        }
        if(aCount==bCount)
            return true;
        else
            return false;
    }
}
