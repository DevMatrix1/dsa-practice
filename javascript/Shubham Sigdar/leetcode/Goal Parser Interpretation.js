// Example 1:

// Input: command = "G()(al)"
// Output: "Goal"
// Explanation: The Goal Parser interprets the command as follows:
// G -> G
// () -> o
// (al) -> al
// The final concatenated result is "Goal".
// Example 2:

// Input: command = "G()()()()(al)"
// Output: "Gooooal"
// Example 3:

// Input: command = "(al)G(al)()()G"
// Output: "alGalooG"
/**
 * @param {string} command
 * @return {string}
 */

//P: always string, no empty string
//R: string
//E: G()()()()(al)=>Gooooal
var interpret = function(command) {
    let str=[];
   for(let i=0;i<command.length;i++){
     if(command[i]=="G")
       str.push("G");
     else if(command[i]=="(" && command[i+1]==")"){
      str.push("o");
      i+=1
     } 
     else if(command[i]=="(" && command[i+1]=="a"){
      str.push("al");
       i+=3;
     }
       
   }
   return str.join("");
  };
  // var interpret = function(command) {
  //   console.log(command.split("()").join("o").split("(al)").join("al"))
  // };
  // interpret("G()()(al)")