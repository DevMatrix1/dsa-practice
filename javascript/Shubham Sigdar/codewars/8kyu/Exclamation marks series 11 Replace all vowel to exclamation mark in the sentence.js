// Description:
// Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.

// Examples
// replace("Hi!") === "H!!"
// replace("!Hi! Hi!") === "!H!! H!!"
// replace("aeiou") === "!!!!!"
// replace("ABCDE") === "!BCD!"
function replace(s){
    //coding and coding....
    
    // const regex= /[aeiouAEIOU]/i;
    return s.replace(/[aeiou]/gi,"!");
  }