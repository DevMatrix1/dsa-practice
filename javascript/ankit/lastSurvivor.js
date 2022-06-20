// link- https://www.codewars.com/kata/609eee71109f860006c377d1/train/javascript

function lastSurvivor(letters, coords) {
  let string = letters;
  for (let index of coords) {
    string = string.slice(0, index) + string.slice(index + 1);
  }
  return string;
}
