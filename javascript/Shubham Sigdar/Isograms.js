// An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

// Example: (Input --> Output)

// "Dermatoglyphics" --> true
// "aba" --> false
// "moOse" --> false (ignore letter case)

//P: string
//R: return true and false
//E:
//P:

function isIsogram(str){
    var i, j;
    str = str.toLowerCase();
    for(i = 0; i < str.length; ++i) {
      for(j = i + 1; j < str.length; ++j) {
        if(str[i] === str[j]) {
          return false;
        }
      }
    }
    return true;
 }
 console.log( isIsogram("Dermatoglyphics"), true )
 console.log( isIsogram("isogram"), true )
 console.log( isIsogram("aba"), false, "same chars may not be adjacent" )
 console.log( isIsogram("moOse"), false, "same chars may not be same case" )
 console.log( isIsogram("isIsogram"), false )
 console.log( isIsogram(""), true, "an empty string is a valid isogram" )
 // isIsogram("Dermatoglyphics")
 // isIsogram("aba")