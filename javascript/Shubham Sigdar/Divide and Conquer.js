// Given a mixed array of number and string representations of integers, add up the string integers and subtract this from the total of the non-string integers.

//P: mixed array of number and string 
//R: return add up the string integers and subtract this from the total of the non-string integers.
//E:
//P:
//sepearte krta 
//map int mai conce

function divCon(x){
    let x1= x.filter((e)=>typeof e==="number"?e:'').reduce((a,b)=>a+b,0)
    // console.log(x1)
    let x2= x.filter((e)=>typeof e==="string"?e:'').map((e)=>+e).reduce((a,b)=>a+b,0)
    return x1-x2
  }
  console.log(divCon([9, 3, '7', '3']), 2)
  console.log(divCon(['5', '0', 9, 3, 2, 1, '9', 6, 7]), 14)
  console.log(divCon(['3', 6, 6, 0, '5', 8, 5, '6', 2,'0']), 13)
  // divCon([9, 3, '7', '3'])