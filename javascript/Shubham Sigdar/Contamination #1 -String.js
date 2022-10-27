// An AI has infected a text with a character!!

// This text is now fully mutated to this character.

// If the text or the character are empty, return an empty string.
// There will never be a case when both are empty as nothing is going on!!

// Note: The character is a string of length 1 or an empty string.

// Example
// text before = "abc"
// character   = "z"
// text after  = "zzz"

//P: string, empty string
//R: return string and If the text or the character are empty, return an empty string.
//E:
//P:

function contamination(text, char){
    if(text == "" || char == ""){
      return ""
    }else{
      let s1 = text.split('')
      let s2= s1.map((item)=>item=char)
      return s2.join('')
    }
  }
  console.log(contamination("abc","z"), "zzz")
  console.log(contamination("","z"), "")
  console.log(contamination("abc",""), "")
  console.log(contamination("_3ebzgh4","&"), "&&&&&&&&")
  console.log(contamination("//case"," "), "      ")
  // contamination("","z")
  // contamination("abc","")
  // contamination("_3ebzgh4","&")