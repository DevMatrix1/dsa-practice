// Instructions
// Write a function that takes a single string (word) as argument. The function must return an ordered list containing the indexes of all capital letters in the string.

// Example
// Test.assertSimilar( capitals('CodEWaRs'), [0,3,4,6] );

//P: string
//R: return an ordered list containing the indexes of all capital letters in the string.
//E: 
//P:
//split into array

var capitals = function (word) {
	let word1 = word.split('')
  let word2 = []
  // console.log(word1) //[ 'C', 'o', 'd', 'E', 'W', 'a', 'R', 's' ]
  for(let i = 0; i<word1.length; i++){
    if(word1[i]===word1[i].toUpperCase()){
      word2.push(i)
    }
  }
  return word2
};
console.log(capitals('CodEWaRs'), [0,3,4,6] );
// capitals('CodEWaRs')