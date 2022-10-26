// You receive the name of a city as a string, and you need to return a string that shows how many times each letter shows up in the string by using asterisks (*).

// For example:
// As you can see, the letter c is shown only once, but with 2 asterisks.
// The return string should include only the letters (not the dashes, spaces, apostrophes, etc). There should be no spaces in the output, and the different letters are separated by a comma (,) as seen in the example above.
// Note that the return string must list the letters in order of their first appearance in the original string.

// More examples:

// "Bangkok"    -->  "b:*,a:*,n:*,g:*,k:**,o:*"

//P: string
//R: return a string that shows how many times each letter shows up in the string by using asterisks (*). The return string should include only the letters (not the dashes, spaces, apostrophes, etc). There should be no spaces in the output, and the different letters are separated by a comma (,) the return string must list the letters in order of their first appearance in the original string.
//E: "Bangkok"    -->  "b:*,a:*,n:*,g:*,k:**,o:*"
//P:

function getStrings(city){
    let city1 = city.toLowerCase().split(' ').join('');
    // console.log(city1)
    let obj={}
    
      for (let elem of city1) {
          if (!(elem in obj)) {
              obj[elem] = '*';
          } else {
              obj[elem] += '*';
          }
      }
    return JSON.stringify(obj).replace(/['"{}]+/g, '')
  }
  // console.log(getStrings("Chicago"), "c:**,h:*,i:*,a:*,g:*,o:*")
  // console.log(getStrings("Bangkok"), "b:*,a:*,n:*,g:*,k:**,o:*")
  // console.log(getStrings("Las Vegas"), "l:*,a:**,s:**,v:*,e:*,g:*")
  getStrings("Chicago")