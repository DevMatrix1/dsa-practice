// This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.

//P:given a integer
//R:if it is even number multiply with eight and return it and if it is odd multiply with 9 and return it
//E:2 =>16, 3=>27
//P: if else condition modulus 


function simpleMultiplication(number) {
    if(number%2==0){
      return number*8
    }else{
      return number*9
    }
      
  }
  console.log(simpleMultiplication(2),16,'Should return double given argument..')
  console.log(simpleMultiplication(1),9,'Should return double given argument..')
  console.log(simpleMultiplication(8),64,'Should return given argument times eight...')
  console.log(simpleMultiplication(4),32,'Should return given argument times eight...')
  console.log(simpleMultiplication(5),45,'Should return given argument times nine...')