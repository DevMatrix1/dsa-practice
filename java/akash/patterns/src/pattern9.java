public class pattern9 {
    public static void main(String[] args) {
        System.out.println("Pattern 9:");
        int n = 5;
        //half part
        for(int i = 1; i<=n; i++){
            for(int j = 1; j < n+i; j++){
                if(j <= n - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        //other half
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
