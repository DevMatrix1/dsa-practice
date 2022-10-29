//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
//        The output should be two capital letters with a dot separating them.
//
//        It should look like this:
//
//        Sam Harris => S.H
//
//        patrick feeney => P.F
public class AbbreviateaTwoWordName {
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }
    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0)+"."+names[1].charAt(0)).toUpperCase();
    }
}
