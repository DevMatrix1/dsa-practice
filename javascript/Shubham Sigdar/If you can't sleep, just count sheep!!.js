// If you can't sleep, just count sheep!!

// Task:
// Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.

var countSheep = function (num){
 
    let num1=""
    if(num>0){
      for(let i=1;i<=num;i++){
        num1=num1+`${i} sheep...`
    }
    return num1
    }else{
      return ""
    }
    
    // console.log(num1)
    
  }
  console.log(countSheep(0), "")
  console.log(countSheep(1), "1 sheep...")
  console.log(countSheep(2), "1 sheep...2 sheep...")
  console.log(countSheep(3), "1 sheep...2 sheep...3 sheep...")
  countSheep(3)