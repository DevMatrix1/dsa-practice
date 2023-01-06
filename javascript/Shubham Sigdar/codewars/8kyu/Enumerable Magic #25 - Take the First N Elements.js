// Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.

// If you need help, here's a reference:
function take(arr, n) {
    // Your code here
    let arr1=[]
    if(arr.length===0){
      return []
    }else if(n>arr.length){
      return arr
    }
    
    else{
      for(let i=0;i<n;i++){
      arr1.push(arr[i])
    }
  
      return arr1
    }
     
  }