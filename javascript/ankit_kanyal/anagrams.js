/*

Write a function that will find all the anagrams of a word from a list. You will be given two inputs a word and an array with words. You should return an array of all the anagrams or an empty array if there are none. For example:

anagrams('abba', ['aabb', 'abcd', 'bbaa', 'dada']) => ['aabb', 'bbaa']
anagrams('racer', ['crazer', 'carer', 'racar', 'caers', 'racer']) => ['carer', 'racer']
anagrams('laser', ['lazing', 'lazy',  'lacer']) => []

*/

const checkIsAnagram = (string, item, strObj) => {
  if (string.length != item.length) return false;

  let itemObj = {};

  for (let c of item) {
    if (itemObj.hasOwnProperty(c)) {
      itemObj[c] = itemObj[c] + 1;
    } else {
      itemObj[c] = 1;
    }
  }
  if (strObj.length != itemObj.length) {
    return false;
  }

  for (let i in itemObj) {
    if (strObj[i] != itemObj[i]) return false;
  }

  return true;
};

const anagrams = (string, list) => {
  let li = [];
  let strObj = {};

  for (let c of string) {
    if (strObj.hasOwnProperty(c)) {
      strObj[c] = strObj[c] + 1;
    } else {
      strObj[c] = 1;
    }
  }
  for (let item of list) {
    if (checkIsAnagram(string, item, strObj)) {
      li.push(item);
    }
  }

  return li;
};

console.log(anagrams("racer", ["crazer", "carer", "racar", "caers", "racer"]));
