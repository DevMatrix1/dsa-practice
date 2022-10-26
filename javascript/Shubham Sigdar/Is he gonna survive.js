// A hero is on his way to the castle to complete his mission. However, he's been told that the castle is surrounded with a couple of powerful dragons! each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he should carry.. Assuming he's gonna grab a specific given number of bullets and move forward to fight another specific given number of dragons, will he survive?

// Return True if yes, False otherwise :)
//P: take two integer
//R: return true and false
//E: (5, 2)=>True (10,5)=>true (2,3)=>False
//P: if condition dragron *2 is less than

function hero(bullets, dragons){
    if((dragons*2)<=bullets){
      return true 
    }else{
      return false
    }
  }
  console.log(hero(10, 5), true)
  console.log(hero(7, 4), false)
  console.log(hero(5, 2),true)
  console.log(hero(10, 5),true)
  console.log(hero(2, 3),false)
  //each dragon takes two bullet to defeat
  //hero don't know how many bullet he should carry
  