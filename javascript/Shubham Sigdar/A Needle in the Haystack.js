// Can you find the needle in the haystack?

// Write a function findNeedle() that takes an array full of junk but containing one "needle"

// After your function finds the needle it should return a message (as a string) that says:

// "found the needle at position " plus the index it found the needle, so:

// findNeedle(['hay', 'junk', 'hay', 'hay', 'moreJunk', 'needle', 'randomJunk'])
// should return "found the needle at position 5" (in COBOL "found the needle at position 6")


//P: takes an array full of junk but containing one "needle"
//R:After your function finds the needle it should return a message (as a string) that says: "found the needle at position " plus the index it found the needle,
//E:
//P:
function findNeedle(haystack) {
    return "found the needle at position " + haystack.indexOf("needle");
  }
  
  // function findNeedle(haystack) {
  //   for(let i=0;i<=haystack.length;i++){
  
  //     if(haystack[i]==un ){
  //       return ("undefined, Your function didn't return anything")
  //     }
  //         if(haystack[i]==='needle'){
  //       return `found the needle at position ${i}`
  //     }
     
  //   }
    
  //   // haystack.forEach((element,index)=>{
  //   //   if(element==undefined){
  //   //     return ("undefined, Your function didn't return anything")
  //   //   }
  //   //   else if(element==='needle'){
  //   //      return `found the needle at position ${index}`
  //   //   }
       
  //   // })
    
  // }
  var haystack_1 = ['3', '123124234', undefined, 'needle', 'world', 'hay', 2, '3', true, false];
  var haystack_2 = ['283497238987234', 'a dog', 'a cat', 'some random junk', 'a piece of hay', 'needle', 'something somebody lost a while ago'];
  var haystack_3 = [1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,'needle',1,2,3,4,5,5,6,5,4,32,3,45,54];
  
  console.log(findNeedle(haystack_1), undefined, "Your function didn't return anything")
  console.log(findNeedle(haystack_1), 'found the needle at position 3')
  console.log(findNeedle(haystack_2), 'found the needle at position 5')
  console.log(findNeedle(haystack_3), 'found the needle at position 30')