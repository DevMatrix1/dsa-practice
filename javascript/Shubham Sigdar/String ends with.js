
// Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).

// the second parameter needs to be at the end of the first parameter. Example:
// solution('hello' , 'llo') would return true because 'llo' is at the end of 'hello'
// But something like solution('hello', 'llow') would return false because 'llow' is NOT at the end of 'hello'
// Examples:

// solution('abc', 'bc') // returns true
// solution('abc', 'd') // returns false

//P: string
//R: return true and false
//E:
//P:

function solution(str, ending){
    return str.endsWith(ending)
   }
   
   console.log(solution('abcde', 'cde'), true)
   console.log(solution('abcde', 'abc'), false)
   console.log(solution('hello' , 'llo'), true)
   console.log(solution('hello' , 'llow'), false)
   console.log(solution('sumo', 'omo'), false)
   console.log(solution('samurai', 'ai'), true)