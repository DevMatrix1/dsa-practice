// Find the number with the most digits.

// If two numbers in the argument array have the same number of digits, return the first one in the array.

//P: array
//R: return number with the most digits and If two numbers in the argument array have the same number of digits, return the first one in the array
//E: 
//P:
function findLongest(array){
    return array.reduce((res, curr) => (String(res).length < String(curr).length) ? curr : res);
  }
  
  console.log(findLongest([1, 10, 100]), 100)
  console.log(findLongest([9000, 8, 800]), 9000)
  console.log(findLongest([8, 900, 500]), 900)