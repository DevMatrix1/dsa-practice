package DSA.Array;

public class Countprimeno {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    public static int countPrimes(int n) {
        int count=0;
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
    public static boolean isPrime(int m){
        if(m<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(m);i++){
            if(m%i==0){
                return false;
            }
        }
        return true;
    }
}
