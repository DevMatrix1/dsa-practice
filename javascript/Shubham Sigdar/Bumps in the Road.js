// Your car is old, it breaks easily. The shock absorbers are gone and you think it can handle about 15 more bumps before it dies totally.

// Unfortunately for you, your drive is very bumpy! Given a string showing either flat road ("_") or bumps ("n"), work out if you make it home safely. 15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".

//P: string flat road ("_") or bumps ("n")
//R: 15 bumps or under, return "Woohoo!", over 15 bumps return "Car Dead".
//E: 
//P:

function bump(x){
    let x1 = x.split('_')
  
    let x2 = x1.filter(entry => entry.trim()!= '');
    // console.log(x2)
    let count = 0;
    for(let i=0; i<x2.length; i++){
      count+=x2[i].length
    }
    // console.log(count)
    if(count>15){
      return "Car Dead"
    }else{
      return "Woohoo!"
    }
  }
  
  console.log(bump("n"), "Woohoo!")
  console.log(bump("_nnnnnnn_n__n______nn__nn_nnn"), "Car Dead")
  console.log(bump("______n___n_"), "Woohoo!")
  // bump("_nnnnnnn_n__n______nn__nn_nnn")
  // bump("n")
  // bump("______n___n_")