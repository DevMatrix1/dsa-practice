// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findDisappearedNumbers = function(nums) {
    let nums1=new Set();
    for(let i=1;i<=nums.length;i++){
      nums1.add(i)
    }
    // console.log(nums1)
    nums.forEach(e=>{
      if(nums1.has(e)){
        nums1.delete(e)
      }
    })
    return Array.from(nums1)
  };