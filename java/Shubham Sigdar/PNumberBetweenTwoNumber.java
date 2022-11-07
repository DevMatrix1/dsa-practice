public class PNumberBetweenTwoNumber {
    public static void main(String[] args) {
        int flag=0;
        int n1=2;
        int n2=8;
        for(int i=n1;i<=n2;i++){
            flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }

            }
            if(flag==0){
                System.out.println(i);
            }

        }
    }
}
