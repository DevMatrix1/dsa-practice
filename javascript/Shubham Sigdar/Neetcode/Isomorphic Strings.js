// Given two strings s and t, determine if they are isomorphic.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

// Example 1:

// Input: s = "egg", t = "add"
// Output: true
// Example 2:

// Input: s = "foo", t = "bar"
// Output: false
// Example 3:

// Input: s = "paper", t = "title"
// Output: true
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
//  https://leetcode.com/problems/isomorphic-strings/solutions/1261227/isomorphic-strings/?orderBy=most_votes
var isIsomorphic = function(s, t) {
    if(s.length!=t.length){
      return false;
    }
    if(s===t){
      return true;
    }
    let obj1={}
    let obj2={}
    for(let i=0;i<s.length;i++){
      if(!obj1[s[i]]){
        obj1[s[i]]=t[i]
      }
      if(!obj2[t[i]]){
        obj2[t[i]]=s[i]
      }
      if(obj1[s[i]]!==t[i] || obj2[t[i]]!==s[i]){
        return false;
      }
    }
    return true;
  }