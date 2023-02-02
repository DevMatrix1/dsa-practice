// Description
// Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

// Please implement encode and decode

// Wechat reply 【Google】 get the latest requent Interview questions. (wechat id : jiuzhang1104)


// Example
// Example1

// Input: ["lint","code","love","you"]
// Output: ["lint","code","love","you"]
// Explanation:
// One possible encode method is: "lint:;code:;love:;you"
// Example2

// Input: ["we", "say", ":", "yes"]
// Output: ["we", "say", ":", "yes"]
// Explanation:
// One possible encode method is: "we:;say:;:::;yes"
var encode = (strs) => {
    let strs1= strs.map((str) => `${str.length}#${str}`)
    return strs1.join('');                           
}


// console.log(encode1)

var decode=(str)=>{
  console.log(str)
  let str1=[]
  for(let i=0;i<str.length;i++){
    if(str.charCodeAt(i)>47 && str.charCodeAt(i)<58 && str.charAt(i+1)=="#"){
      let wordSize=str.charCodeAt(i)-48;
      console.log(wordSize)
      str1.push(str.substring(i+2,i+2+wordSize))
    }
  }
  return str1
}
let encode1= encode(["we", "say", ":", "yes"])
// console.log()
console.log(decode(encode1))
