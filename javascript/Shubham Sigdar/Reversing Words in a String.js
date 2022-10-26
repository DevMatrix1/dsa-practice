// You need to write a function that reverses the words in a given string. A word can also fit an empty string. If this is not clear enough, here are some examples:

// As the input may have trailing spaces, you will also need to ignore unneccesary whitespace.

// Example (Input --> Output)

// "Hello World" --> "World Hello"
// "Hi There." --> "There. Hi"

//P: string, empty string
//R: return a string with reverse word
//E: 
//P: 
function reverse(string){
    //split the string into array
    let arr = string.split(' ')
   // console.log(arr)
    //use reverse method
    let arr1= arr.reverse()
    // console.log(arr1)
    //join
    let arr2 = arr1.join(',').toString()
    // console.log(arr2)
    return arr2;
    //to string()
  }
  console.log(reverse('I am an expert at this'), 'this at expert an am I')
  console.log(reverse('This is so easy'), 'easy so is This')
  console.log(reverse('no one cares'), 'cares one no')
  console.log(reverse(''), '')
  console.log(reverse('CodeWars'), 'CodeWars')
  // reverse('I am an expert at this')
  // reverse('This is so easy')
  // reverse('no one cares')
  // reverse('')
  // reverse('CodeWars')
  // reverse('Hi There.')
  