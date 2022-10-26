// A trick I learned in elementary school to determine whether or not a number was divisible by three is to add all of the integers in the number together and to divide the resulting sum by three. If there is no remainder from dividing the sum by three, then the original number is divisible by three as well.

// Given a series of digits as a string, determine if the number represented by the string is divisible by three.

// Example:

// "123"      -> true
// "8409"     -> true
// "100853"   -> false
// "33333333" -> true
// "7"        -> false

//P: Given a series of digits as a string
//R: return true  if the number represented by the string is divisible by three. otherwise false
//E:
//P:
function divisibleByThree(str){
  
    str2=str.split('').map(e=>+e).reduce((a,b)=>a+b,0)
    if(str2%3==0)
      return true
    else
      return false
  }
  console.log(divisibleByThree('123'), true, "Should return true if the sum of the given digits is divisible by 3.")
  console.log(divisibleByThree('19254'), true, "Should return true if the sum of the given digits is divisible by 3.")
  console.log(divisibleByThree('88'), false, "Should return false if the sum of the given digits is not divisible by 3.")
  console.log(divisibleByThree('1'), false, "Should return false if the sum of the given digits is not divisible by 3.")