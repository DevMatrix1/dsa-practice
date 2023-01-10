// Numbers ending with zeros are boring.

// They might be fun in your world, but not here.

// Get rid of them. Only the ending ones.

// 1450 -> 145
// 960000 -> 96
// 1050 -> 105
// -1050 -> -105
function noBoringZeros(n) {
    // your code
    while ((Math.abs(n) > 9) && (n % 10 === 0)) {
          n /= 10;
      }
      return n;
  }
  