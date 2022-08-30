public class pattern10 {
    public static void main(String[] args) {
        System.out.println("Pattern 10:");
        int to_add = 1;
        int n = 5;
        int i = 1;
        while(i >= 0){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i == n)
                to_add = -1;

            i += to_add;
        }
    }
}
