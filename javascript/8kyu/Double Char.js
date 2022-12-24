// Given a string, you have to return a string in which each character (case-sensitive) is repeated once.

// Examples (Input -> Output):
// * "String"      -> "SSttrriinngg"
// * "Hello World" -> "HHeelllloo  WWoorrlldd"
// * "1234!_ "     -> "11223344!!__  "
function doubleChar(str) {
    let str1=str.split('');
  //   console.log(str1);
    let str2=str1.map(e=>e.repeat(2));
    return str2.join('');
  }