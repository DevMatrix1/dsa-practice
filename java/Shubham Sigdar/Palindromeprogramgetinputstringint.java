import java.util.Scanner;

public class Palindromeprogramgetinputstringint {

    public static void main(String[] args) {
        String original, reverse="";
        Scanner s= new Scanner(System.in);
        original = s.nextLine();
        int length=original.length();
        for (int i = length-1; i >=0 ; i--) {
            reverse = reverse + original.charAt(i);

        }
        if (original.equals(reverse)){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a Palindrome Number");
        }

    }
}
