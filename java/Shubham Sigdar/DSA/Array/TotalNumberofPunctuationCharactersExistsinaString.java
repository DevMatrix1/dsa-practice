package DSA.Array;

public class TotalNumberofPunctuationCharactersExistsinaString {
    public static void main(String[] args) {
        int count=0;
        String s = "He said, 'The mailman loves you.' I heard it with my own ears.";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='!' || s.charAt(i)=='.' || s.charAt(i)=='\'' ||s.charAt(i)=='-' ||s.charAt(i)=='\"' ||s.charAt(i)=='?' ||s.charAt(i)==';' ){
                count++;
            }

        }
        System.out.println(count);
    }
}
