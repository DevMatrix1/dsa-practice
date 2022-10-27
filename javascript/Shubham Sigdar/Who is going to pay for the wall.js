// Your code will show Full name of the neighbor and the truncated version of the name as an array. If the number of the characters in name is less than or equal to two, it will return an array containing only the name as is"

//P: string
//R: return Full name of the neighbor and the truncated version of the name as an array.and if the number of the characters in name is less than or equal to two it will return an array containing only the name as is"
//E: 
//P: 


function whoIsPaying(name){
    //check string.length
    let name1=name.split(' ')
    if(name.length<=2){
      return name1
    }else{
      let name2= name[0]+name[1]
      // console.log(name2)
      name1.push(name2)
      return name1
    }
  }
  console.log(whoIsPaying("Mexico"),["Mexico", "Me"])
  console.log(whoIsPaying("Melania"),["Melania", "Me"])
  console.log(whoIsPaying("Melissa"),["Melissa", "Me"])
  console.log(whoIsPaying("Me"),["Me"])
  console.log(whoIsPaying(""), [""])


//   2nd best solution
  function whoIsPaying(name){
    if (name.length <= 2) return [name]
    return [name, name.slice(0, 2)]
  }