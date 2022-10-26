public class Palindromeprogram {
    public static void main(String[] args) {
        int n=546,sum=0,r,temp;
        temp=n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("palindrome Number");
        }else{
            System.out.println("not a palindrome Number");
        }

    }
}
