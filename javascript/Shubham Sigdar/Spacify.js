// Modify the spacify function so that it returns the given string with spaces inserted between each character.

// spacify("hello world") // returns "h e l l o   w o r l d"


//P: string
//R: returns the given string with spaces inserted between each character.
//E: 
//P:

function spacify(str) {
    //map
    str=str.split('').join(' ')
    return str
    
  }
  console.log(spacify('hello world'),'h e l l o   w o r l d')
  console.log(spacify('12345'),'1 2 3 4 5')