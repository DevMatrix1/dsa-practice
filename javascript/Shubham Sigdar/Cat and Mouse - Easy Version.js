function catMouse(x){
    let x1= x.slice(1,x.length-2)
    // console.log(x1.length)
    if(x1.length<3){
      return "Caught!"
    }else{
      return "Escaped!"
    }
    
  }
  console.log(catMouse('C....m'), "Escaped!");
  console.log(catMouse('C..m'), "Caught!");
  console.log(catMouse('C.....m'), "Escaped!");