// link- https://workat.tech/problem-solving/practice/three-sum

class Solution {
	List<List<Integer>> threeSum(int[] nums) {
        // add your logic here
        int target = 0;
        ArrayList<List<Integer>> sol = new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0){
            return sol;
        }
        Arrays.sort(nums);
        for(int i = 0 ; i<=nums.length-1 ;i++){
           
                int remaining  = target - nums[i] ;
                int front = i+1;
                int back = nums.length-1;
            
                while(front < back){
                    int twoSum = nums[front] + nums[back];
                    if(twoSum < remaining)front++;
                    else if(twoSum >remaining)back--;
                    else{
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[front]);
                        triplet.add(nums[back]);
                        sol.add(triplet);

                        while(front < back && nums[front] == triplet.get(1))front++;
                        while(front < back && nums[back] == triplet.get(2))back--;  
                    }
                }
            while( i+1<=nums.length-1 && nums[i] == nums[i+1]) i++;
        }
        return sol;
    }
}