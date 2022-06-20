// link- https://leetcode.com/problems/container-with-most-water/

// approach with O(n^2) Complexity.

// var maxArea = function (height) {
//   let length = height.length;
//   let left = Array(length).fill(0);
//   let right = Array(length).fill(0);
//   left[0] = height[0];
//   right[length - 1] = height[length - 1];

//   let j = length - 2;
//   for (let i = 1; i < length; i++) {
//     left[i] = Math.max(left[i - 1], height[i]);
//     right[j] = Math.max(height[j], right[j + 1]);
//     j--;
//   }

//   let maxArea = 0;
//   for (let i = 0; i < length; i++) {
//     for (let j = i + 1; j < length; j++) {
//       let tempArea = Math.min(left[i], right[j]) * (j - i);
//       maxArea = Math.max(maxArea, tempArea);
//     }
//   }

//   return maxArea;
// };

// Approach with O(n) time complexity.

var maxArea = function (height) {
  let low = 0,
    high = height.length - 1;
  let maxArea = 0;
  while (low < high) {
    let curArea = Math.min(height[high], height[low]) * (high - low);
    maxArea = Math.max(maxArea, curArea);
    if (height[low] < height[high]) {
      low++;
    } else {
      high--;
    }
  }

  return maxArea;
};

let arr = [2, 3, 4, 5, 18, 17, 6];

console.log(maxArea(arr));
