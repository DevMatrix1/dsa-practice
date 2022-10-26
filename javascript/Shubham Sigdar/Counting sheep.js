// Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

// For example,

// [true,  true,  true,  false,
//   true,  true,  true,  true ,
//   true,  false, true,  false,
//   true,  false, false, true ,
//   true,  true,  true,  true ,
//   false, false, true,  true]
// The correct answer would be 17.

// Hint: Don't forget to check for bad values like null/undefined
let array1=[true,  true,  true,  false,
              true,  true,  true,  true ,
              true,  false, true,  false,
              true,  false, false, true ,
              true,  true,  true,  true ,
              false, false, true,  true ];

//P:array include boolean values null undefined
//R:number of true
//E:
//P:
function countSheeps(arrayOfSheep) {
  // phla ak count variable lelega count krna ka liya
  //map method lga dega each element ko count krna ka liya
  //element true hoga to count++
  //element null,undefind or false huwa to count nhi kraga
  let count=0;
  let arr=arrayOfSheep.map(element=>{
    if(element==true){
      count++;
    }
    
  });
  return count;
}
console.log(countSheeps(array1), 17, "There are 17 sheeps in total")