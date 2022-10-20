package sept_12_2022;
import java.util.*;

public class a_two_elevators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t = 1; t<=T; t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int dista = Math.abs(a - 1);
            int distb = Math.abs(c-b) + Math.abs(c - 1);

            if(dista == distb){
                System.out.println(3);
            } else if(dista < distb){
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

        sc.close();
    }
}
