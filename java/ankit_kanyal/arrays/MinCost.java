// link- https://leetcode.com/problems/minimum-time-to-make-rope-colorful/

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int res = 0, max_cost = 0, sum_cost = 0, n = colors.length();
        for (int i = 0; i < n; ++i) {
            if (i > 0 && colors.charAt(i) != colors.charAt(i - 1)) {
                res += sum_cost - max_cost;
                sum_cost = max_cost = 0;
            }
            sum_cost += neededTime[i];
            max_cost = Math.max(max_cost, neededTime[i]);
        }
        res += sum_cost - max_cost;
        return res;
    }
}
