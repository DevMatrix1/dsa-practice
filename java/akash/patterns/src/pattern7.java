public class pattern7 {
    public static void main(String[] args) {
        System.out.println("Pattern 7:");
        int n = 5;
        for(int i = 1; i<=n; i++){
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
