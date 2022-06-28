function solution(input, markers) {
  let list = input.split("\n");
  console.log(list);
  let finalStringList = [];
  for (let string of list) {
    let li = string.split(" ");
    let ans = [];
    for (let i = 0; i < li.length; i++) {
      if (markers.includes(li[i]) || markers.includes(li[i].charAt(0))) {
        break;
      } else {
        ans.push(li[i]);
      }
    }
    finalStringList.push(ans.join(" "));
  }
  return finalStringList.join("\\n");
}

let input = "apples, plums % and bananas\npears\noranges !applesauce";
let markers = ["%", "!"];

console.log(solution(input, markers));
