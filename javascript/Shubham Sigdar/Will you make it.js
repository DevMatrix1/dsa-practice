// You were camping with your friends far away from home, but when it's time to go back, you realize that your fuel is running out and the nearest pump is 50 miles away! You know that on average, your car runs on about 25 miles per gallon. There are 2 gallons left.

// Considering these factors, write a function that tells you if it is possible to get to the pump or not.

// Function should return true if it is possible and false if not

//P: we have three parameter one is distance to pump, miles per galon 1galon=25miles and fule left
//R: return true and  false
//E: 100 50 1 =>false
//P: 

const zeroFuel = (distanceToPump, mpg, fuelLeft) => {
    if(mpg*fuelLeft>=distanceToPump)
      return true
    else
      return false
  };
  
  console.log(zeroFuel(50, 25, 2), true);
  console.log(zeroFuel(100, 50, 1), false);