// Create a function with two arguments that will return an array of the first n multiples of x.

// Assume both the given number and the number of times to count will be positive numbers greater than 0.

// Return the results as an array or list ( depending on language ).

// Examples
// countBy(1,10) === [1,2,3,4,5,6,7,8,9,10]
// countBy(2,5) === [2,4,6,8,10]
//P: two parameter is given and both are integer which is greater than 0
//R: return n no. of array with multiple of x
//E: countBy(1,10) === [1,2,3,4,5,6,7,8,9,10], count(2,3)===[2,4,6]
//P: 

function countBy(x, n) {
    let z = [];
    //for loop 1 to n
    //push each element to array z
    for(let i=1;i<=n;i++ ){
      z.push(x*i)
    }
    return z
  }
  console.log(countBy(1,10),[1,2,3,4,5,6,7,8,9,10])
  console.log(countBy(2,5),[2,4,6,8,10])