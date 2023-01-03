function warnTheSheep(queue) {
    let queue1=queue.reverse()
    console.log(queue1)
    if(queue1[0]=="wolf"){
      return "Pls go away and stop eating my sheep"
    }
    else{
      for(let i=0;i<queue1.length;i++){
        if(queue1[i+1]=="wolf"){
          return `Oi! Sheep number ${i+1}! You are about to be eaten by a wolf!`
        }
      }
    }
  
  }