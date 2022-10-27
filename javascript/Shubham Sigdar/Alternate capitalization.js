// Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.

// For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

// The input will be a lowercase string with no spaces.

// Good luck!

// If you like this Kata, please try:

// Indexed capitalization

// Even-odd disparity

//P: string
//R:capitalize the letters that occupy even indexes and odd indexes separately, and return an array
//E: capitalize("abcdef") = ['AbCdEf', 'aBcDeF']
//P: 



function capitalize(s){
    //split
    let s1 = s.split('')
    // console.log(s1) [ 'c', 'o', 'd', 'e', 'w', 'a', 'r', 'r', 'i', 'o', 'r', 's' ]
    let s2 = []
    let s3 = []
    for(let i=0; i<s1.length; i++){
      if(i%2==0){
         s2.push(s1[i].toUpperCase())
      }else{
         s2.push(s1[i])
      }
    }
    for(let i=0; i<s1.length; i++){
      if(i%2==1){
         s3.push(s1[i].toUpperCase())
      }else{
         s3.push(s1[i])
      }
    }
    return [s2.join(''),s3.join('')]
    
    
  };
  
  console.log(capitalize("abcdef"),['AbCdEf', 'aBcDeF'])
  console.log(capitalize("codewars"),['CoDeWaRs', 'cOdEwArS'])
  console.log(capitalize("abracadabra"),['AbRaCaDaBrA', 'aBrAcAdAbRa'])
  console.log(capitalize("codewarriors"),['CoDeWaRrIoRs', 'cOdEwArRiOrS'])
  // capitalize("codewarriors")