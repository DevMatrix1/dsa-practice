// //Here we have a function that help us spam our hearty laughter. But is not working! I need you to find out why...

// Expected results:

// spam(1);  // hue
// spam(6);  // huehuehuehuehuehue
// spam(14); // huehuehuehuehuehuehuehuehuehuehuehuehuehue
function spam(number){
    //TODO: Not returning the expected value.
    return "hue".repeat(number);
  }
  console.log(spam(1), "hue", "spam(1) should return 'hue'")
  console.log(spam(6), "huehuehuehuehuehue", "spam(6) should return 'huehuehuehuehuehue'");
  console.log(spam(14), "huehuehuehuehuehuehuehuehuehuehuehuehuehue", "spam(14) should return 'huehuehuehuehuehuehuehuehuehuehuehuehuehue'")