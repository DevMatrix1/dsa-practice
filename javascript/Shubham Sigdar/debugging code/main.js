// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Input: strs = ["dog","racecar","car"]
// Output: ""
var longestCommonPrefix = function(strs) {
    
    let pre = strs[0];
    
    for(let word of strs) {
                
        for(let i = pre.length - 1; i >= 0; i--) {
                             
            if(pre[i] !== word[i]) {
                pre = pre.slice(0, i);
            }
        }
    }
    
    return pre;
};
console.log(longestCommonPrefix(["flower","flow","flight"]))