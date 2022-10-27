// Complete the solution so that it reverses all of the words within the string passed in.

// Example(Input --> Output):

// "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"

//P: string
//R: return reverse all the word within the string
//E:  "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
//P: 

function reverseWords(str){
    //split str
    str=str.split(' ').reverse().join(' ')
    return str
    //reverse()
    
    // return
  }
  console.log(reverseWords('The greatest victory is that which requires no battle'), "battle no requires which that is victory greatest The")
  // reverseWords('The greatest victory is that which requires no battle')