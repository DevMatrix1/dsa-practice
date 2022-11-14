//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
public class Simplemultiplication {
    public static int simpleMultiplication(int n) {
        //your code here
        if(n%2==0){
            return n*8;
        }else{
            return n*9;
        }
    }
}
