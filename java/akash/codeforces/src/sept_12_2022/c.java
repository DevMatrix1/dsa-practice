package sept_12_2022;

import java.util.*;

public class c {
//
//    public static int[] dfs(int i, int steps, int prev, int cost, int n, int[] nums, int[] vis){
//        if(i < 0 || i >= n || vis[i] == 1)
//            return new int[]{cost, steps};
//
//        vis[i] = 1;
//
//        int[] leftt;
//        int[] leftn ;
//        int[] rightt;
//        int[] rightn;
//
//        vis[i] = 0;
//
//        return new int[]{};
//    }
    public static void solve(int n, int[] nums){
        for (int a:
             nums) {
            System.out.print(a+" ");
        }

        // DIDN'T SOLVED

        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t = 1; t<=T; t++){
            String s = sc.next();
            int n = s.length();

            int[] arr = new int[n];
            for(int i = 0; i<n; i++){
                arr[i] = s.charAt(i)-96;
            }

            solve(n, arr);
//            for (int a: arr) {
//                System.out.print(a+" ");
//            }
//            System.out.println();
//            System.out.println(n+" "+s);
        }


        sc.close();
    }
}

