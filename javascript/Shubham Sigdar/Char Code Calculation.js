// Given a string, turn each character into its ASCII character code and join them together to create a number - let's call this number total1:

// 'ABC' --> 'A' = 65, 'B' = 66, 'C' = 67 --> 656667
// Then replace any incidence of the number 7 with the number 1, and call this number 'total2':

// total1 = 656667
//               ^
// total2 = 656661
//               ^
// Then return the difference between the sum of the digits in total1 and total2:

//   (6 + 5 + 6 + 6 + 6 + 7)
// - (6 + 5 + 6 + 6 + 6 + 1)
// -------------------------
//                        6

//P:
//R:
//E:
//P:

function calc(x){
    let x1=x.split('').map(x=>x.charCodeAt(0));
   let total1 = x1.join('')
   // console.log(total1)
    var total2 = total1.replace(/7/g,1)
     // console.log(total2)
    total1 = total1.split("").map(item=>+(item))
    console.log(total1)
    total2 = total2.split("").map(item=>+(item))
    return total1.reduce(function(a,b){return a+b})-total2.reduce(function(a,b){return a+b})
  }
           
  
  console.log(calc('abcdef'), 6);
  console.log(calc('ifkhchlhfd'), 6); 
  console.log(calc('aaaaaddddr'), 30);
  console.log(calc('jfmgklf8hglbe'), 6);
  console.log(calc('abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'), 96);
  // calc('abcdef')