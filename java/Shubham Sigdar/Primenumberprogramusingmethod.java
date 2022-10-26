//Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only.
// In other words prime numbers can't be divided by other numbers than itself or 1.
//For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
public class Primenumberprogramusingmethod {

    public static void main(String[] args) {
        isItPrimeNumber(3);
        isItPrimeNumber(5);
        isItPrimeNumber(7);
        isItPrimeNumber(10);
    }

    static void isItPrimeNumber(int n) {
        int m=0,flag=0,i;
        m=n/2;
        if(n==0 || n==1){
            System.out.println("not a prime number");
        }
        for ( i = 2; i <= m; i++) {
            if(n%i==0){
                System.out.println("not a prime number");
                flag=1;
                break;
            }

        }
        if (flag==0){
            System.out.println("prime number");
        }
    }

}
