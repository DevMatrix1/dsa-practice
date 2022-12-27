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
  console.log(valueLeftRight);
  console.log(valueTopBottom);
  console.log(valueErrorSuccess);
  if(valueLeftRight==="left" && valueTopBottom==="top"){
    let div = document.createElement("div");
    div.style.top='0px';
    div.style.left='0px';
    console.log('leftright');
    document.querySelector('body').appendChild(div);
  }
  
});