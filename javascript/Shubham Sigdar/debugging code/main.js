var encode = (strs) => {
    let strs1= strs.map((str) => `${str.length}#${str}`)
    return strs1.join('');                           
}


// console.log(encode1)

var decode=(str)=>{
  let str1=[]
  for(let i=0;i<str.length;i++){
    if(str.charAt(i)>47 && str.charAt(i)<58 && str.charAt(i+1)=="#"){
      let wordSize=str.charCodeAt(i)-48;
      console.log(wordSize)
      str1.push(str.substring(i+2,i+2+wordSize))
    }
  }
  return str1
}
let encode1= encode(["we", "say", ":", "yes"])
console.log(encode1)
console.log(decode(encode1))
