// Your task is to sum the differences between consecutive pairs in the array in descending order.

// Example
// [2, 1, 10]  -->  9
// In descending order: [10, 2, 1]

// Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9

// If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell, None in Rust).
function sumOfDifferences(arr) {
    if(arr.length==0){
      return 0;
    }
    let arr1=arr.sort((a,b)=>b-a)
    // console.log(arr1)
    let sum=0
    // let diff;
    for(let i=0;i<arr1.length-1;i++){
      let diff=arr1[i]-arr1[i+1];
      sum =sum+diff;
    }
    return sum;
  }