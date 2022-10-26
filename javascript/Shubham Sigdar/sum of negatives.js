// Given an array of integers.

// Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

// If the input is an empty array or is null, return an empty array.

// Example
// For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].


//P: array of number
//R: return count of positive number and sum of negative number
//E:  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
//P: first to seperate positibve number using filter then use reduce method to add and count++

function countPositivesSumNegatives(input) {
    let input1=input.filter((negativeNo)=>negativeNo<0).reduce((acc,cur)=>acc+cur,0)
    // console.log(input1)
    let input2=input.filter((positiveNo)=>positiveNo>0).length
    // console.log(input2)
    return [input2,input1]
  }
  console.log(countPositivesSumNegatives([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15]))
  // countPositivesSumNegatives([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15])
  