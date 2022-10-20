public class pattern11 {
    public static void main(String[] args) {
        System.out.println("Pattern 11:");
        int n = 5;
        for(int i = 1; i<=n; i++) {
            int num = i % 2 == 0? 0: 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num = num == 1? 0: 1;
            }
            System.out.println();
        }
    }
}
