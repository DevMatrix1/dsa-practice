// You are given a string containing a sequence of character sequences separated by commas.

// Write a function which returns a new string containing the same character sequences except the first and the last ones but this time separated by spaces.

// If the input string is empty or the removal of the first and last items would cause the resulting string to be empty, return an empty value (represented as a generic value NULL in the examples below).

// Examples
// "1,2,3"      =>  "2"
// "1,2,3,4"    =>  "2 3"
// "1,2,3,4,5"  =>  "2 3 4"

// ""     =>  NULL
// "1"    =>  NULL
// "1,2"  =>  NULL

//P: string
//R: eturns a new string containing the same character sequences except the first and the last If the input string is empty or the removal of the first and last items would cause the resulting string to be empty, return an empty value (represented as a generic value NULL 
//E: 
//P: 
function array(arr){
    let arr1= arr.split(',')
    // console.log(arr1)
    if(arr1.length<=2){
      return null;
    }
    else{
      let removed=arr1.slice(1,-1)
      return removed.join(' ')
    }
  }
  
  console.log(array('1,2,3'), '2')
  console.log(array('1,2,3,4'), '2 3')
  console.log(array('1,2,3,4,5'), '2 3 4')
  console.log(array(''), null)
  console.log(array('1'), null)
  console.log(array('1,2'), null)
  // array('1,2,3,4,5')