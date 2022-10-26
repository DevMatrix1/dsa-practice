// Nickname Generator

// Write a function, nicknameGenerator that takes a string name as an argument and returns the first 3 or 4 letters as a nickname.

// If the 3rd letter is a consonant, return the first 3 letters.

// nickname("Robert") //=> "Rob"
// nickname("Kimberly") //=> "Kim"
// nickname("Samantha") //=> "Sam"
// If the 3rd letter is a vowel, return the first 4 letters.

// nickname("Jeannie") //=> "Jean"
// nickname("Douglas") //=> "Doug"
// nickname("Gregory") //=> "Greg"
// If the string is less than 4 characters, return "Error: Name too short".

//P: string 
//R: returns the first 3 or 4 letters as a nickname. If the 3rd letter is a consonant, return the first 3 letters.If the 3rd letter is a vowel, return the first 4 letters.If the string is less than 4 characters, return "Error: Name too short".
//E: 
//P:

function nicknameGenerator(name){
    if (name.length<4) return "Error: Name too short";
    if (name[2].match(/[aeuio]/)) return name.slice(0,4)
    return name.slice(0,3)
  }
  console.log(nicknameGenerator("Jimmy"), "Jim")
  console.log(nicknameGenerator("Samantha"), "Sam")
  console.log(nicknameGenerator("Sam"), "Error: Name too short")
  console.log(nicknameGenerator("Kayne"), "Kay", "'y' is not a vowel")
  console.log(nicknameGenerator("Melissa"), "Mel")
  console.log(nicknameGenerator("James"), "Jam")