// Complete the solution so that it returns the number of times the search_text is found within the full_text.

// Usage example:

// solution('aa_bb_cc_dd_bb_e', 'bb') # should return 2 since bb shows up twice
// solution('aaabbbcccc', 'bbb') # should return 1

//P: string
//R: returns the number of times the search_text is found within the full_text.
//E:
//P: match method, count, split the full text


function solution(fullText, searchText){
    let count=fullText.split(searchText).length - 1;
    console.log(count)
  }
  
  // (solution('abcdeb','b'), 2)
  // (solution('abbc','bb'), 1)
  // (solution('abc','b'), 1);
  solution('abbbbc','bb')
  
  // (solution('abcdeb','b'), 2)
  // (solution('abbc','bb'), 1)
  // (solution('abc','b'), 1);
  solution('abbc','bb')