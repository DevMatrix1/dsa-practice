// link- https://devsnest.in/algo-challenges/find-the-town-judge?tab=question

// Explanation link- https://leetcode.com/problems/find-the-town-judge/discuss/1663344/C%2B%2BJavaPython3Javascript-Everything-you-need-to-know-from-start-to-end-.


static int solve(int n, int[][] trust){
    int[] Trusted = new int[n+1];
        for(int[] person : trust){
            Trusted[person[0]]--;
            Trusted[person[1]]++;
        }
        for(int i = 1;i < Trusted.length;i++){
            if(Trusted[i] == n-1) return i;
        }
        return -1;
}
