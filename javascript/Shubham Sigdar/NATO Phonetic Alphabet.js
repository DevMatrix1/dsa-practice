// Complete the function word (string) and returns a string that spells the word using the NATO phonetic alphabet.

// There should be a space between each word in the returned string, and the first letter of each word should be capitalized.

// For those of you that don't want your fingers to bleed, this kata already has a dictionary typed out for you.

// Examples
// "hi"      -->  "Hotel India"
// "abc"     -->  "Alpha Bravo Charlie"
// "babble"  -->  "Bravo Alpha Bravo Bravo Lima Echo"
// "Banana"  -->  "Bravo Alpha November Alpha November Alpha"
var nato = (function() {
    var letters =  {
      "A": "Alpha",  "B": "Bravo",   "C": "Charlie",
      "D": "Delta",  "E": "Echo",    "F": "Foxtrot",
      "G": "Golf",   "H": "Hotel",   "I": "India",
      "J": "Juliett","K": "Kilo",    "L": "Lima",
      "M": "Mike",   "N": "November","O": "Oscar",
      "P": "Papa",   "Q": "Quebec",  "R": "Romeo",
      "S": "Sierra", "T": "Tango",   "U": "Uniform",
      "V": "Victor", "W": "Whiskey", "X": "X-ray",
      "Y": "Yankee", "Z": "Zulu"
    }
    
    return function(word) {
      word=word.toUpperCase().split('')
      console.log(word)
      word1=word.map(e=>letters[e])
      return word1.join(' ')
    }
  })()