// Our fruit guy has a bag of fruit (represented as an array of strings) where some fruits are rotten. He wants to replace all the rotten pieces of fruit with fresh ones. For example, given ["apple","rottenBanana","apple"] the replaced array should be ["apple","banana","apple"]. Your task is to implement a method that accepts an array of strings containing fruits should returns an array of strings where all the rotten fruits are replaced by good ones.

// Notes
// If the array is null/nil/None or empty you should return empty array ([]).
// The rotten fruit name will be in this camelcase (rottenFruit).
// The returned array should be in lowercase.

//P: array
//R: if array is null then return null and if rotten fruit name will be in this camelcase then returned array should be in lowercase.
//E: ["apple","rottenBanana","apple"] => ["apple","banana","apple"]
//P:

function removeRotten(arr){
  return arr?arr.map(x=>x.replace('rotten', '').toLowerCase()):[]
}
console.log(removeRotten(["apple","banana","kiwi","melone","orange"]), ["apple","banana","kiwi","melone","orange"])
console.log(removeRotten([]), [])
console.log(removeRotten(["apple","rottenBanana","apple"]),["apple","banana","apple"])
// removeRotten(["apple","rottenBanana","apple"])