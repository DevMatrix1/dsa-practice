package DSA.Array;

public class StringRotation {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="efacb";
        if(str1.length()!=str2.length()) {
            System.out.println("not a rotation");
        }else{

            str1=str1.concat(str2);
            System.out.println(str1);
            System.out.println(str1.indexOf(str2));
            if(str1.indexOf(str2)!=-1){
                System.out.println("rotation");
            }else{
                System.out.println("not rotation");
            }
        }
    }
}
