// Write a simple regex to validate a username. Allowed characters are:

// lowercase letters,
// numbers,
// underscore
// Length should be between 4 and 16 characters (both included).


//P:lowercase letters,  numbers, underscore, Length should be between 4 and 16 characters (both included).
//R: return boolean value
//E: 
//P: 

function validateUsr(username) {
    return (/^[a-z0-9_]{4,16}$/.test(username));
  }
  console.log(validateUsr('asddsa'), true)
  console.log(validateUsr('a'), false)
  console.log(validateUsr('Hass'), false)
  console.log(validateUsr('Hasd_12assssssasasasasasaasasasasas'), false)
  console.log(validateUsr(''), false)
  console.log(validateUsr('____'), true)
  console.log(validateUsr('012'), false)
  console.log(validateUsr('p1pp1'), true)
  console.log(validateUsr('asd43 34'), false)
  console.log(validateUsr('asd43_34'), true)