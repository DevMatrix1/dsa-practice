// Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.

// Examples
// "hello"     -->  "hll"
// "codewars"  -->  "cdwrs"
// "goodbye"   -->  "gdby"
// "HELLO"     -->  "HELLO"

//P: string 
//R: return a string without lowercase vowel
//E:
//P: 
function shortcut(string) {
    return string.replace(/[aeiou]/g, ''); //regex method
  }
  console.log(shortcut('hello'), 'hll')
  console.log(shortcut('how are you today?'), 'hw r y tdy?')
  console.log(shortcut('complain'), 'cmpln')
  console.log(shortcut('never'), 'nvr')
  