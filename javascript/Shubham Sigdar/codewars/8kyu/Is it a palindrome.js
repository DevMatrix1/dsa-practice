// Write a function that checks if a given string (case insensitive) is a palindrome.
function isPalindrome(x) {
    // your code here
    let x1=x.toLowerCase()
    // let x2=x1;
    let str='';
    for(let i=x.length-1;i>=0;i--){
      str+=x1.charAt(i)
    }
    return str==x1
  }