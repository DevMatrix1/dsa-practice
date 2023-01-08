// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
var twoSum = function(nums, target) {
    let map={};
    for(let i=0;i<nums.length;i++){
      let another=target-nums[i];
      if(another in map){
        return [map[another],i]
      }else{
        map[nums[i]]=i;
      }
    }
    
  };
// --------------------------------------------------------------
  var twoSum = (nums, target) => {
    const map = getMap(nums);       
    // console.log(getMap(nums))
    return getSum(nums, target, map)
  }
  
  const getMap = (nums, map = new Map()) => {
    for (let index = 0; index < nums.length; index++) {
        map.set(nums[index], index);                        
    }
    
    return map
     
  }
  
  const getSum = (nums, target, map) => {
    for (let index = 0; index < nums.length; index++) {
        const complement = target - nums[index];
        const sumIndex = map.get(complement);
  
        const isTarget = map.has(complement) && (map.get(complement) !== index)
        if (isTarget) return [ index, sumIndex ]
    }
  
    return [ -1, -1 ];
  }