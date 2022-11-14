
public class FactorialProgramInJava {
    public static void main(String[] args) {
        int n=5;
        int product=1;
        for(int i=n;i>0;i--){
            product*=i;
        }
        System.out.println(product);
    }
}
