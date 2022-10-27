// You will be given an array of objects (hashes in ruby) representing data about developers who have signed up to attend the coding meetup that you are organising for the first time.

// Your task is to return the number of JavaScript developers coming from Europe.

// For example, given the following list:

// your function should return number 1.

// If, there are no JavaScript developers from Europe then your function should return 0.

// Notes:

// The format of the strings will always be Europe and JavaScript.
// All data will always be valid and uniform as in the example above.

//P: array of objects
//R: turn the number of JavaScript developers coming from Europe.
//E: 
//P:

function countDevelopers(list) {
    let count = 0;
    for(let i=0; i<list.length; i++){
      if(list[i].continent == 'Europe' && list[i].language == 'JavaScript'){
        count++;
      }
    }
    if(count>0){
      return count;
    }else{
      return 0;
    }
    
  }
  var list1 = [
    { firstName: 'Noah', lastName: 'M.', country: 'Switzerland', continent: 'Europe', age: 19, language: 'JavaScript' },
    { firstName: 'Maia', lastName: 'S.', country: 'Tahiti', continent: 'Oceania', age: 28, language: 'JavaScript' },
    { firstName: 'Shufen', lastName: 'L.', country: 'Taiwan', continent: 'Asia', age: 35, language: 'HTML' },
    { firstName: 'Sumayah', lastName: 'M.', country: 'Tajikistan', continent: 'Asia', age: 30, language: 'CSS' }
  ];
   const list2 = [
      { firstName: 'Oliver', lastName: 'Q.', country: 'Australia', continent: 'Oceania', age: 19, language: 'HTML' },
      { firstName: 'Lukas', lastName: 'R.', country: 'Austria', continent: 'Europe', age: 89, language: 'HTML' }
    ];
  console.log(countDevelopers(list1), 1, "Noah is the only JavaScript developer from Europe")
  console.log(countDevelopers(list2), 0, "Lukas is not a JS devolper")
  
  