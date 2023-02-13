// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

 

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function(nums) {
    nums=nums.sort((a,b)=>a-b);
    let nums1=[]
    for(let i=0;i<nums.length;i++){
      let a=nums[i]
      if(i>0 && a===nums[i-1]){
        continue;
      }
      j=i+1;
      k=nums.length-1;
      while(j<k){
        let threeSum=nums[i]+nums[j]+nums[k]
        if(threeSum<0){
          j++;
        }else if(threeSum>0){
          k--;
        }else{
          nums1.push([nums[i],nums[j],nums[k]])
          j++;
          k--;
          while (nums[j] === nums[j - 1] && j <k) {
                      j++;
                  }
        }
      }
    }
    return nums1
  };