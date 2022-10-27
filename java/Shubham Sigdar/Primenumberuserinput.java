import java.util.Scanner;

public class Primenumberuserinput {
    static int m=0,flag=0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= s.nextInt();
        if(isItPrimeNumber(n)){
            System.out.println(" prime number");
        }else{
            System.out.println("not a prime number");
        }

    }

     static boolean isItPrimeNumber(int n) {
        m=n/2;
        if (n==0 || n==1){
            return false;
        }
         for (int i = 2; i <=m ; i++) {
             if(n%i==0){
                 return false;
             }

         }
         return true;
     }
}
