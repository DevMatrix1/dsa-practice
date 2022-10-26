// Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

// invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
// invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
// invert([]) == []
// You can assume that all values are integers. Do not mutate the input array/list.

//P: we have give a set of number in array
//R: make positive number to negative and negative number to positive
//E: []=>[] [1]=>[-1] [1,-1]=>[-1,1]
//P: 

function invert(array) {
    let array1=array.map(num=>num<0?-(num):-(num))
    return array1
 }
 console.log(invert([]),[])
 console.log(invert([-1]),[1])
 console.log(invert([1,-1]),[-1,1])
 