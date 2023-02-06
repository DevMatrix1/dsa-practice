
var longestConsecutive = function(nums) {
  let longestStreak = 0;
  for(let num of nums){
    let currentNum = num;
    let currentStreak = 1;

    while (arrayContains(nums, currentNum + 1)) {
      currentNum += 1;
      currentStreak += 1;
    }
  }
};
var arrayContains=function(arr,num){
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == num) {
      return true;
     }
   }
}
longestConsecutive([100,4,200,1,3,2]);
