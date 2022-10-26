// Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

// Return your answer as a number.

//P:array of integers as strings and numbers
//R: return the sum of the array values Return your answer as a number
//E:
//P: arr.reduce((sum, current) => sum + current, 0);
function sumMix(x){
    let result= x.reduce((sum,current)=>sum+Number(current),0)
     return result;
   }
   console.log(sumMix([9, 3, '7', '3']), 22)
   console.log(sumMix(['5', '0', 9, 3, 2, 1, '9', 6, 7]), 42)
   console.log(sumMix(['3', 6, 6, 0, '5', 8, 5, '6', 2,'0']), 41)