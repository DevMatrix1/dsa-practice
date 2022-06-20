function* startGame() {
  const answer = yield "Do you love JavaScript?";
  if (answer !== "Yes") {
    return "Oh wow... Guess we're gone here";
  }
  return "JavaScript loves you back ❤️";
}

const game = startGame();
console.log(game.next().value); // Do you love JavaScript?
console.log(game.next("Yes")); // JavaScript loves you back ❤️
