/*

So basically we can a data structure to store the calculated result.
So that when we need any value first we will check if it is present 
in our data structure or not.
 If it is present then we don't need to make recursive call and 
 simply get the value from the data structure.

The data structure that i have used is a map object.


*/

var fibonacci = function (n, map = {}) {
  if (n == 0 || n == 1) return n;
  let prev1 = 0;
  let prev2 = 0;
  if (map.hasOwnProperty(n - 1)) {
    prev1 = map[n - 1];
  } else {
    prev1 = fibonacci(n - 1, map);
  }
  if (map.hasOwnProperty(n - 2)) {
    prev2 = map[n - 2];
  } else {
    prev2 = fibonacci(n - 2, map);
  }
  map[n] = prev1 + prev2;

  return map[n];
};

console.log(fibonacci(100));
