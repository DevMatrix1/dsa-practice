// Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

// The output should be two capital letters with a dot separating them.

// It should look like this:

// Sam Harris => S.H

// patrick feeney => P.F
//P:takes two words with one space in between them.
//R:The output should be two capital letters with a dot separating them
//E:
//P:
function abbrevName(name){
    //split the string into array
    let arr=name.split("")
    // console.log(arr)
    let arr1=[]
    arr1.push(arr[0])
    for(let i=0;i<arr.length;i++){
      if(arr[i]==" ")
        arr1.push(arr[i+1])
    }
    // console.log(arr1.toString().toUppercase())
    //  return (nameArray[0][0] + "." + nameArray[1][0]).toUpperCase();
    return `${arr1[0]}.${arr1[1]}`.toUpperCase();
  }
  console.log(abbrevName("Sam Harris"), "S.H")
  console.log(abbrevName("Patrick Feenan"), "P.F")
  console.log(abbrevName("Evan Cole"), "E.C")
  console.log(abbrevName("p favuzzi"), "P.F")
  // abbrevName("Sam har")