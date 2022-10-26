// Complete the solution so that it returns a formatted string. The return value should equal "Value is VALUE" where value is a 5 digit padded number.

// Example:

// solution(5) // should return "Value is 00005"

//P: integer
//R: it returns a formatted string. The return value should equal "Value is VALUE" where value is a 5 digit padded number.
//E: 
//P:

function solution(value){
  
    //while loop
      for(let i=0; i<5; i++){
        if(`${value}`.length !=5){
          value = '0' + `${value}`
        }
        
      }
     return `Value is ${value}`
      
      
    }
    
    console.log(solution(5),"Value is 00005")
    console.log(solution(1204),"Value is 01204")
    console.log(solution(109),"Value is 00109")
    console.log(solution(0),"Value is 00000")
    // solution(0)