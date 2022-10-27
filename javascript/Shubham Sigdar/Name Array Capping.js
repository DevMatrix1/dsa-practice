// Create a method that accepts an array of names, and returns an array of each name with its first letter capitalized.

// example

// capMe(['jo', 'nelson', 'jurie'])     // returns ['Jo', 'Nelson', 'Jurie']
// capMe(['KARLY', 'DANIEL', 'KELSEY']) // returns ['Karly', 'Daniel', 'Kelsey']

//P: array of names
//R: returns an array of each name with its first letter capitalized.
//E: capMe(['jo', 'nelson', 'jurie'])     // returns ['Jo', 'Nelson', 'Jurie']

function capMe(names) {
    let names1=[]
    for(let i=0; i<names.length;i++){
      names1.push(names[i].charAt(0).toUpperCase() + names[i].substring(1).toLowerCase())
    }
    return names1
  }
  console.log(capMe(['jo', 'nelson', 'jurie']), ['Jo', 'Nelson', 'Jurie'])
  console.log(capMe(['KARLY', 'DANIEL', 'KELSEY']), ['Karly', 'Daniel', 'Kelsey'])
  