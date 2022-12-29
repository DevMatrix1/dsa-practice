let btn = document.querySelector('button');
// console.log(btn);

// console.log(select);
btn.addEventListener('click',()=>{
  // console.log(event);
  const selectLeftRight = document.querySelector('#leftRight');
  const selectTopBottom = document.querySelector('#topBottom');
  const selectErrorSuccess = document.querySelector('#errorselect');
  const valueLeftRight= selectLeftRight.value;
  const valueTopBottom = selectTopBottom.value;
  const valueErrorSuccess = selectErrorSuccess.value;
  // console.log(valueLeftRight);
  // console.log(valueTopBottom);
  // console.log(valueErrorSuccess);
  runLeftTop(valueLeftRight,valueTopBottom);
  
});

function runLeftTop(valueLeftRight,valueTopBottom){
  console.log('run')
  if(valueLeftRight==="left" && valueTopBottom==="top"){
    let divs = document.createElement("div");
    divs.classList.add('adddiv');
    divs.style.top='1rem';
    divs.style.left='1rem';
    // console.log('leftright');
    document.querySelector('.divcreation').appendChild(divs);
  }
  if(valueLeftRight==="left" && valueTopBottom==="bottom"){
    let divs = document.createElement("div");
    divs.classList.add('adddiv');
    divs.style.bottom='1rem';
    divs.style.left='1rem';
    // console.log('leftright');
    document.querySelector('.divcreation').appendChild(divs);
  }
  if(valueLeftRight==="right" && valueTopBottom==="top"){
    let divs = document.createElement("div");
    divs.classList.add('adddiv');
    divs.style.right='1rem';
    divs.style.top='1rem';
    // console.log('leftright');
    document.querySelector('.divcreation').appendChild(divs);
  }
  if(valueLeftRight==="right" && valueTopBottom==="top"){
    let divs = document.createElement("div");
    divs.classList.add('adddiv');
    divs.style.right='1rem';
    divs.style.top='1rem';
    // console.log('leftright');
    document.querySelector('.divcreation').appendChild(divs);
  }
  if(valueLeftRight==="right" && valueTopBottom==="bottom"){
    let divs = document.createElement("div");
    divs.classList.add('adddiv');
    divs.style.bottom='1rem';
    divs.style.right='1rem';
    // console.log('leftright');
    document.querySelector('.divcreation').appendChild(divs);
  }

  
}