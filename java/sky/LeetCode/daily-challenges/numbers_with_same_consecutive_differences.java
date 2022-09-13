//link: https://leetcode.com/problems/numbers-with-same-consecutive-differences/

//Approach: using DFS, making combinations with every number from 1 to 9 and checking if second number can be added such that prev number and current number have a difference of k

class Solution {
    private void dfs(int num, int prev, List<Integer> list, int n, int k, int times){
        if(times == n){
            list.add(num);
            return;
        }

        if(prev + k <= 9 && k > 0){
            dfs(num*10 + (prev+k), prev+k, list, n, k, times+1);
        }
        if(prev - k >= 0){
            dfs(num*10 + (prev-k), prev-k, list, n, k, times+1);
        }

    }
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> ansList = new ArrayList<>();

        for(int i = 1; i<=9; i++){
            List<Integer> list = new ArrayList<>();
            dfs(i, i, list, n, k, 1);
            ansList.addAll(list);
        }

        int[] arr = new int[ansList.size()];
        int indx = 0;
        for(int num: ansList){
            arr[indx++] = num;
        }

        return arr;
    }
}
