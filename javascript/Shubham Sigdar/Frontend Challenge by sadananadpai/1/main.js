let total = 0;

// console.log(input)
document.querySelector('.positive').addEventListener('click',increase);
document.querySelector('.negative').addEventListener('click',decrease);
function increase(){
  let input = document.getElementById("num").value;
  total+=Number(input);
  // console.log(total)
  document.querySelector('.counter').innerText=total;
}
function decrease(){
  let input = document.getElementById("num").value;
  total-=Number(input);
  // console.log(total)
  document.querySelector('.counter').innerText=total;
}
