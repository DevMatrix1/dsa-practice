// Write a function that will check if two given characters are the same case.

// If either of the characters is not a letter, return -1
// If both characters are the same case, return 1
// If both characters are letters, but not the same case, return 0
// Examples
// 'a' and 'g' returns 1

// 'A' and 'C' returns 1

// 'b' and 'G' returns 0

// 'B' and 'g' returns 0

// '0' and '?' returns -1

function sameCase(a, b){
    // console.log(/^[a-zA-Z]+$/.test(a))
    if(!(/^[a-zA-Z]+$/.test(a) && /^[a-zA-Z]+$/.test(b))){
      return -1
    }else if((/^[A-Z]+$/.test(a) && /^[A-Z]+$/.test(b)) || (/^[a-z]+$/.test(a) && /^[a-z]+$/.test(b))){
      return 1
    }else{
      return 0
    }
  }