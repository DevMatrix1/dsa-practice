let randomNumber = Math.floor(Math.random()*100);
console.log(randomNumber)

// console.log(inputVal)
document.querySelector('.submit').addEventListener('click',funcSubmit)
document.querySelector('.start').addEventListener('click',funcStart)
let guessArray = [];
function funcSubmit() {
  
  let inputVal = document.querySelector('input').value;
  const guess = +inputVal;
//   input.value = '';
  guessArray.push(guess);
  // console.log(inputVal);
  if (inputVal === null)
      return;
  else {

      if (Number(inputVal) === randomNumber) {
          document.querySelector(".lowHigh").innerHTML = 'Your Guess is Right';
          document.querySelector('input').disabled=true;
          
          document.querySelector('.submit').removeEventListener('click', funcSubmit);
        //   document.querySelector('.guessElement').innerText=inputVal
      }
      else if (Number(inputVal) > randomNumber) {
          document.querySelector(".lowHigh").innerHTML = 'Too High!!!';
        //   document.querySelector('.guessElement').innerText=inputVal
      }
      else {
          document.querySelector(".lowHigh").innerHTML = 'Too Low!!!';
        //   document.querySelector('.guessElement').innerHTML=inputVal
      }
      document.querySelector('input').value="";
    //   document.querySelector('.guess').innerText='Your Guess'
    document.querySelector('.guess').textContent = `Your guesses: ${guessArray.join(', ')}`;
  }
}

function funcStart(){
  document.querySelector('input').disabled=false;
  randomNumber = Math.floor(Math.random() * 100);
  console.log(randomNumber);
  document.querySelector('.start').removeEventListener('click',funcStart)
  document.querySelector('.submit').addEventListener('click', funcSubmit);
}


// function funcStart(){
//   document.querySelector('input').disabled=false;
//   randomNumber = Math.floor(Math.random() * 100);
//   console.log(randomNumber);
//   document.querySelector('.submit').addEventListener('click', funcSubmit);
// }

// function funcSubmit(){
//   let inputVal = document.querySelector('input').value;
//   if(inputVal===null){
//     return;
//   }else{
//     if(randomNumber<Number(inputVal)){
//       document.querySelector('.lowHigh').innerText='Too High';
//     }
//     else if(randomNumber>Number(inputVal)){
//       document.querySelector('.lowHigh').innerText='Too Low';
//     }else{
//       document.querySelector('.lowHigh').innerText='You are right';
//       document.querySelector('.submit').removeEventListener('click',funcSubmit)
//       //to disable input <input disable ="disable">
//       document.querySelector('input').disabled = true;
//     }
//   }

//   document.querySelector('input').value='';
  
// }


// });
