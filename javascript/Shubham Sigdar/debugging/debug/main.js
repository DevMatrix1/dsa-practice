function multipleOfIndex(array) {
  let arr1=array.slice(1)
  let arr2=[] 
  // console.log(arr1)
  for(let i=1;i<=arr1.length;i++){
    if(arr1[i]%i === 0){
      arr2.push(arr1[i])
    }
  }
  console.log(arr2)
}
console.log(multipleOfIndex([22, -6, 32, 82, 9, 25]))