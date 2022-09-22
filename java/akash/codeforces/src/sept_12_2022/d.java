package sept_12_2022;

import java.util.*;

public class d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t = 1; t<=T; t++){
            int n = sc.nextInt();
            int[] spend = new int[n];
            int[] budget = new int[n];
            for(int i = 0; i<n; i++){
                spend[i] = sc.nextInt();
            }
            for(int i = 0; i<n; i++){
                budget[i] = sc.nextInt();
            }
            int[] savings = new int[n];
            for(int i = 0; i<n; i++){
                savings[i] = budget[i] - spend[i];
            }
            Arrays.sort(savings);

            int i = 0;
            int j = n-1;

            int groups = 0;

            while(i < j){
                 if(savings[i]+savings[j] >= 0){
                     groups++;
                     i++;
                     j--;
                 } else {
                     i++;
                 }
            }

            System.out.println(groups);
        }


        sc.close();
    }
}
