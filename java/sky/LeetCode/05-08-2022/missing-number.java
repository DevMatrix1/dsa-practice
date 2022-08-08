//Link: https://leetcode.com/problems/missing-number/

//Approach 1: using xor. first xor every number between [0,n] where n is the size of array then xor with every in array. then return xor variable.
class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int n = nums.length;
        while(n > 0){
            xor ^= n;
            n--;
        }
        for(int num: nums)
            xor ^= num;
        
        return xor;
    }
}

//Approach 2: using maths. (n*(n+1))/2 will give sum of first n natural numbers i.e. 1 to n. n is the size of array. Then we can simple iterate through the array to and subtract all elements in the array from that sum. This way we will be left with the difference and that is the only element not present in the array. finally, return the ans.
class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int sum = (n*(n+1))/2;
        
        for(int num: nums)
            sum -= num;
        
        return sum;
    }
}
