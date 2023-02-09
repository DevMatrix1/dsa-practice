// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

// Given a string s, return true if it is a palindrome, or false otherwise.

 

// Example 1:

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.
// Example 2:

// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.
// Example 3:

// Input: s = " "
// Output: true
// Explanation: s is an empty string "" after removing non-alphanumeric characters.
// Since an empty string reads the same forward and backward, it is a palindrome.
/**
 * @param {string} s
 * @return {boolean}
 */
//1. convert uppercase into lowercase(done)
//2. removing all non-alphanumeric characters
var isPalindrome = function(s) {
    let s1=s.toLowerCase()
      // console.log(s1)
    var regexPattern = /[^A-Za-z0-9]/g;
    var ans = s1.replace(regexPattern, "");
    console.log(ans)
    let temp="";
    for(let i=ans.length-1;i>=0;i--){
      temp+=ans[i]
    }
    if(ans==temp){
      return true;
    }else{
      return false;
    }
  };
  
  