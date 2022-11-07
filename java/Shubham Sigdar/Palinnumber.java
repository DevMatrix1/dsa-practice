public class Palinnumber {
    public static void main(String[] args) {
        int n=34543;
        int rem=0;
        int sum=0;
        int temp=n;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        if(temp==sum){
            System.out.println(temp+"is a palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

}
