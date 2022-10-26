// There are 32 letters in the Polish alphabet: 9 vowels and 23 consonants.

// Your task is to change the letters with diacritics:

// ą -> a,
// ć -> c,
// ę -> e,
// ł -> l,
// ń -> n,
// ó -> o,
// ś -> s,
// ź -> z,
// ż -> z
//P: polish string
//R: return a string without polish character
//E:
//P:
function correctPolishLetters (string) {
    let letters = {ą: "a",
  ć: "c",
  ę: "e",
  ł: "l",
  ń: "n",
  ó: "o",
  ś: "s",
  ź: "z", //use object
  ż: "z"};
  for (let i in letters){
    string = string.split('').map(e => e == i ? letters[i] : e).join('');
  }
  return string;
  }
  console.log(correctPolishLetters("Jędrzej Błądziński"),"Jedrzej Bladzinski")
  console.log(correctPolishLetters("Lech Wałęsa"),"Lech Walesa")
  console.log(correctPolishLetters("Maria Skłodowska-Curie"),"Maria Sklodowska-Curie")
  // correctPolishLetters("Maria Skłodowska-Curie")