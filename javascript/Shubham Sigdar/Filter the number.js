// Filter the number
// Oh, no! The number has been mixed up with the text. Your goal is to retrieve the number from the text, can you return the number back to its original state?

// Task
// Your task is to return a number from a string.

// Details
// You will be given a string of numbers and letters mixed up, you have to return all the numbers in that string in the order they occur.

//P: string
//R: return the number from text
//E:
//P:
var FilterString = function(value) {
    //split
    let value1 = value.split('').map(item => item=+item) //[ NaN, 1, NaN, 2, NaN, 3 ]
    let value2 = value1.filter(n => !isNaN(n)).join('');
   // let value1 = value.replace(/\D/g, '');
    return +value2
  }
  
  console.log(FilterString("123"), 123, 'Just return the numbers')
  console.log(FilterString("a1b2c3"), 123, 'Just return the numbers')
  console.log(FilterString("aa1bb2cc3dd"), 123, 'Just return the numbers')
  // FilterString("a1b2c3")