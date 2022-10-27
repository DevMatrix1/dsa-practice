//It's pretty straightforward. Your goal is to create a function that removes the first and last characters of a string
//You're given one parameter, the original string. You don't have to worry with strings with less than two characters.
//To find length of string we use length() method
public class RemoveFirstandLastCharacter {
    public static String remove(String str) {
        if(str.length()<=2){
            return str;
        }else{
            return str.substring(1,str.length()-1);
        }
    }
}
