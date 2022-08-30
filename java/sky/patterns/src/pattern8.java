public class pattern8 {
    public static void main(String[] args) {
        System.out.println("Pattern 8:");
        int n = 5;
        for(int i = n; i>=1; i--){
            for(int j = 1; j < n+i; j++){
                if(j <= n - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
