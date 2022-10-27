// Complete the function caffeineBuzz, which takes a non-zero integer as its argument.

// If the integer is divisible by 3, return the string "Java".

// If the integer is divisible by 3 and divisible by 4, return the string "Coffee"

// If one of the condition above is true and the integer is even, add "Script" to the end of the string.

// If none of the condition is true, return the string "mocha_missing!"

// caffeineBuzz(1)   => "mocha_missing!"
// caffeineBuzz(3)   => "Java"
// caffeineBuzz(6)   => "JavaScript"
// caffeineBuzz(12)  => "CoffeeScript"

//P: takes a non-zero integer as its argument.
//R: If the integer is divisible by 3, return the string "Java". If the integer is divisible by 3 and divisible by 4, return the string "Coffee" If one of the condition above is true and the integer is even, add "Script" to the end of the string.
//E: 
//P:

function caffeineBuzz(n){
    if(n%3==0){
      if(n%2==0){
        return 'JavaScript'
      }else{
        return 'Java'
      }
    }else if(n%3==0 && n%4==0){
      if(n%2==0){
        return 'CoffeeScript'
      }else{
        return 'Coffee'
      }
    }
    else{
      return "mocha_missing!"
    }
  }
  
  console.log(caffeineBuzz(1), "mocha_missing!")
  console.log(caffeineBuzz(3) , "Java")
  console.log(caffeineBuzz(6), "JavaScript")
  console.log( caffeineBuzz(12) , "CoffeeScript")
  