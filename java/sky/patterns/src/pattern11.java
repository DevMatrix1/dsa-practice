public class pattern11 {
    public static void main(String[] args) {
        System.out.println("Pattern 11:");
        int n = 5;
        for(int i = 1; i<=n; i++) {
            for (int j = 1; j < n + i; j++) {
                if (j <= 5)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
