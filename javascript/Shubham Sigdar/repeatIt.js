// Create a function that takes a string and an integer (n).

// The function should return a string that repeats the input string n number of times.

// If anything other than a string is passed in you should return "Not a string"

// Example
// "Hi", 2 --> "HiHi"
// 1234, 5 --> "Not a string"

//P: string and integer
//R: return a string that repeats the input string n number of times. and If anything other than a string is passed in you should return "Not a string"
//E: 
//P:
var repeatIt = function(str, n) {
    if(typeof str == "string"){
      let sss= str.repeat(n)
      return sss
    }else{
      return "Not a string"
    }
    
  }
  console.log(repeatIt("*",3), "***", 'Returned unexpected value')
  console.log(repeatIt("Hello",11), "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello", 'Returned unexpected value')
  