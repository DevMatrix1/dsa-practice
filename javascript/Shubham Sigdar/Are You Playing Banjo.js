// Create a function which answers the question "Are you playing banjo?".
// If your name starts with the letter "R" or lower case "r", you are playing banjo!

// The function takes a name as its only argument, and returns one of the following strings:

// name + " plays banjo" 
// name + " does not play banjo"
// Names given are always valid strings.

//P:takes a name as its only argument
//R:your name starts with the letter "R" or lower case "r", you are playing banjo!
//E:
//P:toLowerCase(),split,for arr[0]=='r'
function areYouPlayingBanjo(name) {
    let n=name.toLowerCase()
    let arr=n.split('')
    if(arr[0]=='r'){
      return `${name} plays banjo`
    }
    else{
       return `${name} does not play banjo`
    }
    
}
console.log(areYouPlayingBanjo("Adam"), "Adam does not play banjo")
console.log(areYouPlayingBanjo("Paul"), "Paul does not play banjo")
console.log(areYouPlayingBanjo("Ringo"), "Ringo plays banjo")
console.log(areYouPlayingBanjo("bravo"), "bravo does not play banjo")
console.log(areYouPlayingBanjo("rolf"), "rolf plays banjo")