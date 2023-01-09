// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if(strs==='undefined' && strs.length===0){
      return ''
    }
    let str1=strs.map(e=>e.length)
    let smallLetterString=strs[str1.indexOf(Math.max(...str1))]
    let prefix='';
    // return smallLetterString
    for(let i=0;i<smallLetterString.length;i++){
      let char=strs[0][i];
      if(strs.every(e=>e[i]===char)){
         prefix+=char
       }else{
         break;
       }
    }
  return prefix
};





































