// You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.

// Array can contain numbers or strings. X can be either.

// Return true if the array contains the value, false if not.
//P:array can contain numbers or strings and value
//R:Return true if the array contains the value, false if not.
//E:
//P:Use forEach array1.forEach(element => console.log(element));
function check(a, x) {
    for(let i=0;i<a.length;i++){
      if(a[i]==x){
        return true
      }
    }
    return false;
  }
  
  console.log(check([66, 101], 66), true)
  console.log(check([101, 45, 75, 105, 99, 107], 107), true)
  console.log(check(['t', 'e', 's', 't'], 'e'), true)
  console.log(check(['what', 'a', 'great', 'kata'], 'kat'), false)
    