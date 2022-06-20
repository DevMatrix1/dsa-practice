/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
  if (nums.length < 3) return [];

  let ans = [];
  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length - 1; i++) {
    if (i > 0 && nums[i] === nums[i - 1]) continue;

    let j = i + 1;
    let k = nums.length - 1;

    while (j < k) {
      console.log(i, j, k);
      let sum = nums[i] + nums[j] + nums[k];
      console.log("Sum " + sum);
      if (sum === 0) {
        ans.push([nums[i], nums[j], nums[k]]);
        let val1 = nums[j];
        while (j < k && nums[j] == val1) j++;

        let val2 = nums[k];
        while (j < k && nums[k] == val2) k--;
      } else if (sum < 0) j++;
      else if (sum > 0) k--;
    }
  }

  return ans;
};

let arr = [1, -1, -1, 0];

console.log(threeSum(arr));
