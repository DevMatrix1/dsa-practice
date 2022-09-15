package fb_hacker_cup;

import java.util.Scanner;
import java.util.HashSet;

public class second_hands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            for (int j = 1; j <= n; j++) {
                int num = sc.nextInt();
                set.add(num);
            }
            if (set.size() >= k && n <= 2 * k)
                System.out.println("Case #" + i + ": YES");
            else
                System.out.println("Case #" + i + ": NO");

        }

        sc.close();
    }
}
