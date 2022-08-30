//link: https://leetcode.com/problems/subsets/
//Approach 1: used backtracking to get different pairs

class Solution {
    private void formSubsets(int idx, int n, List<List<Integer>> ans, List<Integer> cur_list, int[] nums){
        if(idx == n){
            return;
        }
        for(int i = idx; i<n; i++){
            cur_list.add(nums[i]);
            ans.add(new ArrayList<>(cur_list));
            formSubsets(i+1, n, ans, cur_list, nums);
            cur_list.remove(cur_list.size() - 1);
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        ans.add(new ArrayList<>());
        formSubsets(0, n, ans, new ArrayList<Integer>(), nums);

        return ans;
    }
}