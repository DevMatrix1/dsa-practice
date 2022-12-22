 const phone = document.getElementById('phone');

function getStringWithNumbersOnly(str){
  
  let str1=[...str]
  // console.log(str1)
  let str2=str1.filter(v => Number.isInteger(+v) && v !== ' ')
  
  let str3=str2.join('');
  console.log(str3)
  return str3
} 


const formatString = str => {
  const numStr = getStringWithNumbersOnly(str);
  // console.log('+(' + numStr.substring(0, 3) + ') - ' + numStr.substring(3))
  console.log(numStr)
  return numStr.length > 3 ? '+(' + numStr.substring(0, 3) + ') - ' + numStr.substring(3) : numStr;
  // console.log(numStr.substring(0, 3))
};

phone.addEventListener('input', () => (phone.value = formatString(phone.value)));

// const inputVal = document.querySelector('.in');
// let temp=[];
// let temp1=[]
// inputVal.addEventListener('input',function(){
  
//   console.log(this.value);
//   if(this.value.length===3){
//     console.log(`+(${+this.value})-`)
//     temp.push(`+(${+this.value})-`)
//   }
//   else if(this.value.length===10){
//     temp1.push(this.value);
//     console.log(temp1)
//   }
  
// });
// temp[1].replace(temp[1])



// +(797)-
// temp=['+(797)-','7979721719']
// function inp(){
//   let inputVal = document.querySelector('input').value;
//   console.log(inputVal)
//   let temp=inputVal
//   for(let i=0;i<4;i++){
//     if(i==2){
//       temp=temp.substring(0,3);
//       temp=`+(${Number(temp)})`;
//       console.log(temp)
//     }
//   }
// }
// inp()

