// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, u as vowels for this Kata (but not y).

// The input string will only consist of lower case letters and/or spaces.

//P: string
//R: Return the number (count) of vowels in the given string.
//E:
//P:
//for loop
//if
//count++
function getCount(str) {
    let count = 0;
    let vowel = ['a', 'e', 'i', 'o', 'u']
    for(let i=0; i<str.length; i++){
      if(vowel.include(str[i])){
        count++;
      }
    }
    return count;
  }
  (getCount("abracadabra"), 5)