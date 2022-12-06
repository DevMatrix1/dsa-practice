// package DSA.Array;

// str1 = "abcde", str2 = "deabc"

public class Whetheronestringisarotationofanother {
    public static void main(String[] args) {
        String str1="abcde", str2 = "deadc";
        if(str1.length()!=str2.length()){
            System.out.println("not a rotation");
        }
        str1=str1.concat(str1);
        if(str1.indexOf(str2)!=-1){
            System.out.println("rotation");
        }else{
            System.out.println("not a rotation");
        }

    }
}
