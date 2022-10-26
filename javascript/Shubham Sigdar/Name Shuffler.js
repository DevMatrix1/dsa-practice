// Write a function that returns a string in which firstname is swapped with last name.

// nameShuffler('john McClane'); => "McClane john"

//P: string
//R: returns a string in which firstname is swapped with last name.
//E: 
//P: 
function nameShuffler(str){
    //split the string into array
    let str1= str.split(' ')
    // console.log(str1)
    //reverse the string
    let str2= str1.reverse()
    // console.log(str2)
    let str3= str2.join(' ')
    return str3
  }
  console.log(nameShuffler('john McClane'),'McClane john')
  // nameShuffler('john McClane')
  
              