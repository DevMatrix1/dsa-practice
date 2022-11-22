// The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

// Examples
// "din"      =>  "((("
// "recede"   =>  "()()()"
// "Success"  =>  ")())())"
// "(( @"     =>  "))((" 
function duplicateEncode(word){
    word=word.toLowerCase().split('');
    // console.log(word);
    let count={};
    let a=word.forEach(e=>{
      count[e]=count[e]?count[e]+1:1;
    })
    console.log(count);
    let a1=word.map(e=>count[e]>1?')':'(');
    return a1.join('');
  }
  duplicateEncode("Success")
  