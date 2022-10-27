// Write a function which removes from string all non-digit characters and parse the remaining to number. E.g: "hell5o wor6ld" -> 56

// Function:

// getNumberFromString(s)

//P: string
//R: return number
//E: "hell5o wor6ld" -> 56
//P:

//split string to array
function getNumberFromString(s) {
    let s1 = s.split('')
    // console.log(s1)
    let s2 = s1.map((item)=> !isNaN(Number(item))? item : '')
    let s3 = s2.filter((item) => item != '')
    let s4 = s3.filter((item) => item != ' ')
    return +s4.join("")
  }
  console.log(getNumberFromString("1"), 1)
  console.log(getNumberFromString("123"), 123)
  console.log(getNumberFromString("this is number: 7"), 7)
  console.log(getNumberFromString("hell5o wor6ld"))