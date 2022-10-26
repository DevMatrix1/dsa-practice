// In this kata, you will do addition and subtraction on a given string. The return value must be also a string.

// Note: the input will not be empty.

//P: string
//R: return string
//E: "1plus2plus3plus4"  --> "10" "1plus2plus3minus4" -->  "2"
//P:
function calculate(str) {
    return eval(str.split("plus").join("+").split("minus").join("-")).toString();
  
  }
  // console.log(calculate("1plus2plus3plus4"), '10')
  // console.log(calculate('1minus2minus3minus4'), '-8')
  // console.log(calculate('1plus2plus3minus4'), '2')
  calculate('1plus2plus3minus4')