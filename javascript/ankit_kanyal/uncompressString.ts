// link- https://bigfrontend.dev/problem/uncompress-string

const isNumeric = (str: string) => !isNaN(parseFloat(str)) && isFinite(Number(str))

function uncompress(str: string): string {
 const stack: string[] = []

  for (const char of str) {
    if (char !== ')') {
      stack.push(char)
    } else {
      let word = ''
      let count = ''

      
      while (stack.length && stack[stack.length - 1] !== '(') word = stack.pop() + word
      stack.pop() 


      while (stack.length && isNumeric(stack[stack.length - 1])) count = stack.pop() + count
      stack.push(word.repeat(Number(count)))
    }
  }

  return stack.join('')
}


