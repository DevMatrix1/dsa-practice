function sumOfDifferences(arr) {
    if(arr.length==0){
      return 0;
    }else{
        let arr1=arr.sort((a,b)=>b-a)
    // console.log(arr1)
    let sum=0
    let diff;
    for(let i=0;i<arr1.length-1;i++){
      diff=arr1[i]-arr1[i+1];
      sum += diff;
    }
    return sum
    }
    
   
}
console.log(sumOfDifferences([2, 1, 10,17]))
