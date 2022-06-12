// link to problem https://leetcode.com/problems/pascals-triangle/

var generate = function (noRows) {
  let arr = [[1], [1, 1]];
  if (noRows == 1) return [[1]];
  if (noRows == 2) return arr;
  for (let i = 3; i <= noRows; i++) {
    let temp = [1];
    for (let j = 2; j < i; j++) {
      temp.push(arr[i - 2][j - 2] + arr[i - 2][j - 1]);
    }
    temp.push(1);
    arr.push(temp);
  }
  return arr;
};
