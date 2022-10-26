// Given a non-empty array of integers, return the result of multiplying the values together in order. Example:

// [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

//P: given a array of integer 
//R: return the result of multiplying the values together in order
//E: [1,2]=>1*2=2
//P: 

function grow(x){
    let product=1
    //for loop upto x.length
    for(let i=0;i<x.length;i++){
      product*=x[i]
    }
       //product*=x[i]
    return product
    
  }
  
  console.log(grow([1, 2, 3]), 6)
  console.log(grow([4, 1, 1, 1, 4]), 16)
  console.log(grow([2, 2, 2, 2, 2, 2]), 64)