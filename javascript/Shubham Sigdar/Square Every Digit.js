// Welcome. In this kata, you are asked to square every digit of a number and concatenate them.
// For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
// Note: The function accepts an integer and returns an integer


function squareDigits(num) {
    //split the num and make string
    num = num.toString().split('')
    // console.log(arr)
    //use map square each number in arr
    let arr=num.map(e=>(+e)**2).join('')
    return parseInt(arr)
    //return new arr
  }
  console.log(squareDigits(3212), 9414)
  console.log(squareDigits(2112), 4114)
  console.log(squareDigits(12),14)
  // squareDigits(3212)