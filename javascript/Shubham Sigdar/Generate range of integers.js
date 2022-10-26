// Implement a function named generateRange(min, max, step), which takes three arguments and generates a range of integers from min to max, with the step. The first integer is the minimum value, the second is the maximum of the range and the third is the step. (min < max)

// Task
// Implement a function named

// generateRange(2, 10, 2) // should return array of [2,4,6,8,10]
// generateRange(1, 10, 3) // should return array of [1,4,7,10]
// Note
// min < max
// step > 0
// the range does not HAVE to include max (depending on the step)
//P: take three number ? not a number? string?special character
//R: return an array with sequenec of integer from min to max with the step
//E: (1,4,1)->[1,2,3,4] (5,10,2)->[5,7,9]
//P:
function generateRange(min, max, step){
    let arr=[]
    for(let i=min;i<=max;i+=step){
      arr.push(i)
    }
    return arr
  }
  console.log(generateRange(2, 10, 2), [2,4,6,8,10])
  // console.log(generateRange(1,4,1),[1,2,3,4])
  // console.log(generateRange(5,10,2),[5,7,9])