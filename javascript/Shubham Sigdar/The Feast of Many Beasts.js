// All of the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.

// Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.

// Assume that beast and dish are always lowercase strings, and that each has at least two letters. beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.
//P:takes the animal's name and dish as arguments
//R:returns true or false
//E:
//P:
// ('chick',chocolk)['c','h']
function feast(beast, dish) {
    //your function here
      let beast1=beast.split('')
      let dish1=dish.split('')
      // console.log(beast1)
      // console.log(dish1)
      for(let i=0;i<beast1.length;i++){
        if(beast1[0]==dish1[0] && beast1[beast1.length-1]==dish1[dish1.length-1])
          return true;
      }
      return false
    }
    console.log(feast("great blue heron", "garlic naan"), true)
    console.log(feast("chickadee", "chocolate cake"), true)
    console.log(feast("brown bear", "bear claw"), false)
    // feast("great blue heron", "garlic naan")