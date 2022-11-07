
public class PNumber {
    public static void main(String[] args) {
        int flag=0;
        int n=5;
        if(n==0 && n==1){
            flag=1;
            System.out.println("not a prime number");
        }
            for (int i = 2; i <n ; i++) {
                if(n%i==0){
                    flag=1;
                    System.out.println("not a prime number");
                    break;
                }

            }
        if (flag == 0) {
            System.out.println("prime number");
        }

        }

    }

