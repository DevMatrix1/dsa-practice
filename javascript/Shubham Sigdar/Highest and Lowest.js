// In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

// Examples
// highAndLow("1 2 3 4 5");  // return "5 1"
// highAndLow("1 2 -3 4 5"); // return "5 -3"
// highAndLow("1 9 3 4 -5"); // return "9 -5"
// Notes
// All numbers are valid Int32, no need to validate them.
// There will always be at least one number in the input string.
// Output string must be two numbers separated by a single space, and highest number is first.

//P: a string of space separated numbers, valid number, There will always be at least one number in the input string, 
//R: return the highest and lowest number.
//E:
//P: sort the string and then return str[0] and str[n-1]
function highAndLow(numbers){
    let numbers1 = numbers.split(' ')
    let numbers2 = numbers1.filter(e => String(e).trim());
    // console.log(numbers2)
    numbers2.sort(function(a, b) {
    return a - b;
    });
    let numbers3 = `${numbers2[numbers2.length-1]} ${numbers2[0]}`
    return numbers3
  }
  console.log(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"), "42 -9")
  console.log(highAndLow("1 2 3"), "3 1")
  // highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4")