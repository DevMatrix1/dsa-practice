// Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

// You can use each character in text at most once. Return the maximum number of instances that can be formed.

 

// Example 1:



// Input: text = "nlaebolko"
// Output: 1
// Example 2:



// Input: text = "loonbalxballpoon"
// Output: 2
// Example 3:

// Input: text = "leetcode"
// Output: 0
/**
 * @param {string} text
 * @return {number}
 */
var maxNumberOfBalloons = function(text) {
    const v={};
    let newText=new Set(text.split(''))
    console.log(newText)
    for(let char of text){
      if(!newText.has(char)){
        continue;
      }
      let count=((v[char]??0)+1)
      v[char]=count
    }
    console.log(v)
    
    let min=Math.min(v['b'],v['a'],Math.floor(v['l']/2),Math.floor(v['o']/2),v['n'])
    
    return min?min:0;
    
  };