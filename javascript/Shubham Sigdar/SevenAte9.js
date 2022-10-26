// Write a function that removes every lone 9 that is inbetween 7s.

// "79712312" --> "7712312"
// "79797"    --> "777"

function sevenAte9(str) {
    var arr = str.split('');
    for (var i = 0; i < arr.length; i++) {
      if (arr[i] == 7 && arr[i + 1] == 9 && arr[i + 2] == 7)
        arr.splice(i + 1, 1);
    }
    return arr.join('');
  }
  console.log(sevenAte9('797'), '77')
  console.log(sevenAte9('7979797'), '7777')
  // sevenAte9('7979797')
  