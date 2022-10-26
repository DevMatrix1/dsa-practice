// Determine the total number of digits in the integer (n>=0) given as input to the function. For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits. Be careful to avoid overflows/underflows.

// All inputs will be valid.

//P: integer
//R: return the total number of digits in the integer (n>=0) given as input
//E: 
//P:

function digits(n) {
    let count = 0;
    let n1 = String(n).split('')
    console.log(n1)
    for(let i = 0; i<n1.length; i++){
      if(n>=0){
        count++
      }
    }
    return count
  }
  
  console.log(digits(5), 1, "Fail!")
  console.log(digits(12345), 5, "Fail!")
  console.log(digits(9876543210), 10, "Fail!")
  // digits(9876543210)