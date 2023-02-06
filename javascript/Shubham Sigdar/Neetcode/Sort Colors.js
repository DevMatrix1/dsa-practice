// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
/**
 * @param {number[]} nums
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var sortColors = function(nums) {
    let i=0;
    let l=0;
    let r=nums.length-1;
    while(i<=r){
      let num=nums[i];
      if(num===0){
        swap(nums,i,l);
        i++;
        l++
      }else if(num===2){
        swap(nums,i,r)
        r--;
      }else{
        i++;
      }
    }
    return nums;
  
  };
   var swap = function(nums,a,b){
    [nums[a],nums[b]]=[nums[b],nums[a]]
  }