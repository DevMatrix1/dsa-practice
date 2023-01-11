let leftRight =document.querySelector('#lr');
let topBottom =document.querySelector('#tb');
// console.log(lr)
let sucErr=document.querySelector('#sewi');
let duration=document.querySelector('#duration');
let btn =document.querySelector('button');
let cont=document.querySelector('.container');
let sum1=0;
let sum2=0;
let sum3=0;
let sum4=0;
let i=0;
btn.addEventListener('click',()=>{
    let leftRightValue=leftRight.value;
    // console.log(leftRightValue)
    let topBottomValue=topBottom.value;
    // console.log(topBottomValue)
    let sucErrValue=sucErr.value;
    // console.log(sucErrValue);
    let durationValue=duration.value;
    console.log(durationValue);
    let div = document.createElement("div");
    div.className="dynamicdiv"
    
    if(leftRightValue==='left' && topBottomValue==='top'){
        // div.style.top='0px'
        div.style.left='0px';
        div.style.top=`${sum1}px`;
        div.innerText=i++;
        sum1+=35;
        document.body.prepend(div);
        // leftTopRemove();
    }else if(leftRightValue==='left' && topBottomValue==='bottom'){
        // div.style.top='0px'
        div.style.left='0px';
        div.style.bottom=`${sum2}px`;
        sum2+=35;
    }else if(leftRightValue==='right' && topBottomValue==='top'){
        div.style.right='0px';
        div.style.top=`${sum3}px`;
        sum3+=35;
    }else{
        div.style.right='0px';
        div.style.bottom=`${sum4}px`;
        sum4+=35;

    }

    // document.body.insertBefore(div,cont);
})


