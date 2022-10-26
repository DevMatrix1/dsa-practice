// Given 2 strings, a and b, return a string of the form: shorter+reverse(longer)+shorter.

// In other words, the shortest string has to be put as prefix and as suffix of the reverse of the longest.

// Strings a and b may be empty, but not null (In C# strings may also be null. Treat them as if they are empty.).
// If a and b have the same length treat a as the longer producing b+reverse(a)+b

//P: two string a and b 
//R: return a string of the form: shorter+reverse(longer)+shorter. b+reverse(a)+b
//E:
//P:


function shorter_reverse_longer(a,b){
  
    let a1 = a.split('').reverse().join('')
    let b1 = b.split('').reverse().join('')
    console.log(a1)
      if(a.length>=b.length){
        return `${b}${a1}${b}`
      }else{
        return `${a}${b1}${a}`
      }
    }
  
  console.log(shorter_reverse_longer("first", "abcde"), "abcdetsrifabcde");
  console.log(shorter_reverse_longer("hello", "bau"), "bauollehbau");
  console.log(shorter_reverse_longer("abcde", "fghi"), "fghiedcbafghi");
  // shorter_reverse_longer("abcde", "fghi")