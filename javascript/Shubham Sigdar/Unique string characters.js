// In this Kata, you will be given two strings a and b and your task will be to return the characters that are not common in the two strings.

// For example:

// solve("xyab","xzca") = "ybzc" 
// --The first string has 'yb' which is not in the second string. 
// --The second string has 'zc' which is not in the first string. 

//P: String
//R: return the characters that are not common in the two strings.
//E: 
//P: 
function solve(a,b){
    let c = a.split('').filter(val => !b.includes(val));
    let d = b.split('').filter(val => !a.includes(val));
    // console.log(c)
    // console.log(d)
    let e= c.concat(d)
    // console.log(e)
    return e.join('')
  }
  console.log(solve("xyab","xzca"),"ybzc")
  console.log(solve("xyabb","xzca"),"ybbzc")
  console.log(solve("abcd","xyz"),"abcdxyz")
  console.log(solve("xxx","xzca"),"zca")
  solve("xyab","xzca")
  