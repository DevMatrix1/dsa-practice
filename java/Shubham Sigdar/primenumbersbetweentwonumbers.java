import java.util.Scanner;

public class primenumbersbetweentwonumbers {
    static int m=0, flag=0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First Number");
        int start = s.nextInt();
        System.out.println("Enter Second Number");
        int end = s.nextInt();
        for (int i = start; i <=end; i++) {
            if(isItPrimeNumber(i)){
                System.out.println(i+"Prime number");
            }
            else{
                System.out.println(i+" Not a Prime Number");
            }
        }


    }

     static boolean isItPrimeNumber(int n) {
        m=n/2;
        if(n<1){
            return false;
        }
         for (int i = 2; i <=m ; i++) {
             if (n%i==0){
                 return false;
             }

         }
         return true;
    }
}
