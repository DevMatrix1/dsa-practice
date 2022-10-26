// Write a function which calculates the average of the numbers in a given list.
//P:array is given
//R: return average of each number
//E: [1,1,1]=>1 [1,2,3]=>2

function find_average(array) {
    if(array.length==0){
      return 0
    }else{
      n=array.length
      sum=array.reduce((acc,cur)=>acc+cur,0)
      return sum/n
    }
    
  }
  console.log(find_average([1,1,1]))