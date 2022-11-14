//print all the armstrong no. up to the specific limit
public class ArmstrongNo {
    public static void main(String[] args) {
       int n=10;
       int flag=0;
       double rem;
       double sum=0;
       for(int i=1;i<=n;i++){
           double count = 0;
           int num=i;
           while (num != 0) {
               // num = num/10
                num/= 10;
               ++count;
           }
           while(i>0){
               rem=i%10;
               sum=sum+Math.pow(rem,count);
               i=i/10;
           }
           if(i==sum){
               System.out.println(i);
           }
       }
    }
}
