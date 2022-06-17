// link- https://www.codewars.com/kata/5a8d2bf60025e9163c0000bc/train/javascript

function solve(arr) {
  arr.sort((a, b) => a - b);
  let map = {};
  for (let i of arr) {
    if (i in map) {
      map[i] = map[i] + 1;
    } else map[i] = 1;
  }

  let freqArray = [];
  for (let key in map) {
    freqArray.push([key, map[key]]);
  }
  let compareFunc = (a, b) => {
    if (a[1] == b[1]) {
      return a[0] - b[0];
    }
    return b[1] - a[1];
  };
  freqArray.sort(compareFunc);
  let ans = [];
  for (let item of freqArray) {
    let temp = Array(item[1]).fill(parseInt(item[0]));
    temp.forEach((value) => ans.push(value));
  }
  return ans;
}
