// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2
 /**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let n=new Map();
    for(let i=0;i<nums.length;i++){
      if(!n.has(nums[i])){
        n.set(nums[i], 1)
      }else{
        let o=n.get(nums[i])
        n.set(nums[i],o+1)
      }
    }
    // console.log(n)
    for(let [key,value] of n){
      if(value>nums.length/2){
        return key
      }
    }
  };