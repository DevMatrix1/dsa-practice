// Palindrome strings
// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward. This includes capital letters, punctuation, and word dividers.

// Implement a function that checks if something is a palindrome. If the input is a number, convert it to string first.

// Examples
// isPalindrome("anna")   ==> true
// isPalindrome("walter") ==> false
// isPalindrome(12321)    ==> true
// isPalindrome(123456)   ==> false

//P: string, integer, special character?
//R: return true if palindrome otherwise false
//E: 
//P: 
function isPalindrome(line) {
    //convert parameter to a string
     let line1= line.toString();
     // console.log(line1)
     let line2=line1.split('')
     // console.log(line2)
     let line3=line2.reverse().join('').toString()
     // console.log(line3)
     if(line1==line3){
       return true;
     }
     else{
      return false;
     }
   }
   console.log(isPalindrome("anna"), true)
   console.log(isPalindrome("walter"), false)
   console.log(isPalindrome(12321), true)
   console.log(isPalindrome(123456), false)
   // isPalindrome(12321)
   