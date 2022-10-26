// Complete the function/method so that it returns the url with anything after the anchor (#) removed.

// Examples
// "www.codewars.com#about" --> "www.codewars.com"
// "www.codewars.com?page=1" -->"www.codewars.com?page=1"
// http://rat.mil#tukada

//P: string
//R: returns the url with anything after the anchor (#) removed.
//E:
//P:
//split //pop //for
function removeUrlAnchor(url){
    let url1 = url.split('#')
    console.log(url1[0])
  }
  console.log(removeUrlAnchor('www.codewars.com#about'), 'www.codewars.com')
  console.log(removeUrlAnchor('www.codewars.com/katas/?page=1#about'), 'www.codewars.com/katas/?page=1')
  console.log(removeUrlAnchor('www.codewars.com/katas/'), 'www.codewars.com/katas/')
  
  // removeUrlAnchor('www.codewars.com#about')