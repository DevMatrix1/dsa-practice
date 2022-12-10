// Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

// [7] should return 7, because it occurs 1 time (which is odd).
// [0] should return 0, because it occurs 1 time (which is odd).
// [1,1,2] should return 2, because it occurs 1 time (which is odd).
// [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
// [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).



function findOdd(A) {
    let count = {};
    A.forEach(v => {
      count[v] = count[v] ? count[v] + 1 : 1;
    });
    console.log(count)
    console.log(+Object.keys(count).find(key => count[key] % 2 === 1));
  }
  findOdd([1,2,2,3,3,3,4,3,3,3,2,2,1])