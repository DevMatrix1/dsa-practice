// Definition
// A Tidy number is a number whose digits are in non-decreasing order.

// Task
// Given a number, Find if it is Tidy or not .

// Input >> Output Examples
// tidyNumber (12) ==> return (true)
// Explanation:
// The number's digits { 1 , 2 } are in non-Decreasing Order (i.e) 1 <= 2 .

// tidyNumber (32) ==> return (false)
// Explanation:
// The Number's Digits { 3, 2} are not in non-Decreasing Order (i.e) 3 > 2 .

// tidyNumber (1024) ==> return (false)
// Explanation:
// The Number's Digits {1 , 0, 2, 4} are not in non-Decreasing Order as 0 <= 1 .

// tidyNumber (13579) ==> return (true)
// Explanation:
// The number's digits {1 , 3, 5, 7, 9} are in non-Decreasing Order .

// tidyNumber (2335) ==> return (true)

function tidyNumber(n){
    const arr=n.toString().split('')
    for (let i=0;i<arr.length-1;i++)
    {
    if (arr[i]<=arr[i+1]){continue}
    else { return false} 
    }
    return true
    }
  console.log(tidyNumber(12),true)
  console.log(tidyNumber(102),false)
  console.log(tidyNumber(9672),false)
  console.log(tidyNumber(2789),true)
  console.log(tidyNumber(2335),true)
  
//   https://www.codewars.com/kata/5a87449ab1710171300000fd/train/javascript