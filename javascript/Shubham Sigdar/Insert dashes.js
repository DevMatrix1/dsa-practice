// Write a function insert_dash(num) / insertDash(num) / InsertDash(int num) that will insert dashes ('-') between each two odd digits in num. For example: if num is 454793 the output should be 4547-9-3. Don't count zero as an odd digit.

// Note that the number will always be non-negative (>= 0).

//P: integer
//R: return string with insert dashes ('-') between each two odd digits in num.
//E:
//P:
function insertDash(num) {
    let result=[]
    let num1=num.toString().split('')
    // console.log(num1)
    for(let i=0;i<num1.length;i++){
      if(+(num1[i])%2==1 && (+num1[i+1])%2==1){
        result.push(num1[i])
        result.push('-')
        }
      else {
        result.push(num1[i])
        }
    }
    return result.join('')
  }
  
  console.log(insertDash(454793),'4547-9-3')
  console.log(insertDash(123456),'123456')
  console.log(insertDash(1003567),'1003-567')
  // insertDash(454793)