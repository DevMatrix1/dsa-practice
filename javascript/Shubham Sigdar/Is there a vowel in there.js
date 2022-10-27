// Given an array of numbers, check if any of the numbers are the character codes for lower case vowels (a, e, i, o, u).

// If they are, change the array value to a string of that vowel.

// Return the resulting array.
// a : 97
// e : 101 
// i : 105 
// o : 111 
// u : 117


//P: array of number 
//R: return the array with value to a string of that vowel.
//E: 
//P:
function isVow(a){
    const map={
      "97":"a",
      "101":"e",
      "105":"i",
      "111":"o",
      "117":"u"
    }
     return a.map( num => map[num] ? map[num] : num);
    }
    
    console.log(isVow([118,117,120,121,117,98,122,97,120,106,104,116,113,114,113,120,106]),[118,"u",120,121,"u",98,122,"a",120,106,104,116,113,114,113,120,106])
    console.log(isVow([101,121,110,113,113,103,121,121,101,107,103]),["e",121,110,113,113,103,121,121,"e",107,103])