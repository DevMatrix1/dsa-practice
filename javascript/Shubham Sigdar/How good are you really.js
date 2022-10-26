// There was a test in your class and you passed it. Congratulations!
// But you're an ambitious person. You want to know if you're better than the average student in your class.

// You receive an array with your peers' test scores. Now calculate the average and compare your score!

// Return True if you're better, else False!

// Note:
// Your points are not included in the array of your class's points. For calculating the average point you may add your point to the given array!

//P: there are two parameter is given one is array and other is simple number 
//R: return true if yourpoint is greater than class avg point otherwise false 
//E: 
//P:
function betterThanAverage(classPoints, yourPoints) {
    sum=0
    //forloop upto classPoints.length
    for(let i=0; i<classPoints.length;i++){
      sum+=classPoints[i]
    }
       //sum+=classpoin
    //sum/classPoints.length
    let avgClassPoints=sum/classPoints.length
    //if condition
    if(avgClassPoints<yourPoints){
      return true
    }else{
      return false
    }
    
  }
  
  console.log(betterThanAverage([2, 3], 5), true);
  console.log(betterThanAverage([100, 40, 34, 57, 29, 72, 57, 88], 75), true)
  console.log(betterThanAverage([12, 23, 34, 45, 56, 67, 78, 89, 90], 9), false)
  console.log(betterThanAverage([41, 75, 72, 56, 80, 82, 81, 33], 50), false)
  console.log(betterThanAverage([29, 55, 74, 60, 11, 90, 67, 28], 21), false)