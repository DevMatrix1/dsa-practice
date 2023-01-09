// Task:
// Write a function that accepts two integers and returns the remainder of dividing the larger value by the smaller value.

// Division by zero should return NaN.

// Examples:
// n = 17
// m = 5
// result = 2 (remainder of `17 / 5`)

// n = 13
// m = 72
// result = 7 (remainder of `72 / 13`)

// n = 0
// m = -1
// result = 0 (remainder of `0 / -1`)

// n = 0
// m = 1
// result - division by zero (refer to the specifications on how to handle this in your language)
function remainder(n, m){
    // Divide the larger argument by the smaller argument and return the remainder
    let n1=Math.max(n,m)
    let m1=Math.min(n,m)
    if(m1===0){
      return NaN
    }else{
      return n1%m1
    }
  }