// Kata Task
// I have a cat and a dog.

// I got them at the same time as kitten/puppy. That was humanYears years ago.

// Return their respective ages now as [humanYears,catYears,dogYears]

// NOTES:

// humanYears >= 1
// humanYears are whole numbers only
// Cat Years
// 15 cat years for first year
// +9 cat years for second year
// +4 cat years for each year after that
// Dog Years
// 15 dog years for first year
// +9 dog years for second year
// +5 dog years for each year after that
//P: humanYears number
//R:return a array [humanYears,catYears,dogYears]
//E:
//P:
var humanYearsCatYearsDogYears = function(humanYears) {
    let catYears=0
    let dogYears=0
    //for loop le leta hai and use condition lga dega i<humanyears
    
    for(let i=1; i<=humanYears;i++){
      if(i==1){
        catYears+=15
        dogYears+=15
      }
      else if(i==2){
        catYears+=9
        dogYears+=9
      }
      else{
        catYears+=4
        dogYears+=5
      }
    }
    return [humanYears,catYears,dogYears]
  }
  console.log(humanYearsCatYearsDogYears(1), [1,15,15])
  console.log(humanYearsCatYearsDogYears(2), [2,24,24])
  console.log(humanYearsCatYearsDogYears(10), [10,56,64])

  //2nd method
  var humanYearsCatYearsDogYears = function(y) {
    if(y==1) return [1,15,15]
    if(y==2) return [2,24,24]
     return [y, (y-2) * 4 + 24, (y-2) * 5 + 24] 
   }