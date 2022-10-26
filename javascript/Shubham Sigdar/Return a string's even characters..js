// Write a function that returns a sequence (index begins with 1) of all the even characters from a string. If the string is smaller than two characters or longer than 100 characters, the function should return "invalid string".

// For example:

// "abcdefghijklm" --> ["b", "d", "f", "h", "j", "l"]
// "a"             --> "invalid string"

//P: string
//R: returns a sequence (index begins with 1) of all the even characters from a string. If the string is smaller than two characters or longer than 100 characters, the function should return "invalid string".
//E:
//P:

function evenChars(string) {
    if(string.length>101 || string.length<2){
      return "invalid string"
    }
    else{
      let string1= string.split('').filter((char,index)=>index%2)
      return string1
    }
  }
  console.log(evenChars ("1234"), ["2", "4"])
//   console.log(evenChars (";;;--"), [";", "-"])
  console.log(evenChars ("abcdefghijklm"), ["b", "d", "f", "h", "j", "l"])
  console.log(evenChars ("a"), "invalid string")
  console.log(evenChars (""), "invalid string")
  console.log(evenChars ("aiqbuwbjqwbckjdwbwkqbefhglqhfjbwqejbcadn.bcaw.jbhwefjbwqkvbweevkj.bwvwbhvjk.dsvbajdv.hwuvghwuvfhgw.vjhwncv.wecnaw.ecnvw.kejvhnw.evjkhweqv.kjhwqeev.kjbhdjk.vbaewkjva"), "invalid string")