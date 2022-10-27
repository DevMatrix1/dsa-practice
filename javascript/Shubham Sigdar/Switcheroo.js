// Given a string made up of letters a, b, and/or c, switch the position of letters a and b (change a to b and vice versa). Leave any incidence of c untouched.

// Example:

// 'acb' --> 'bca'
// 'aabacbaa' --> 'bbabcabb'

//P: string made up of letters a, b, and/or c,
//R:return switched position of letters a and b (change a to b and vice versa). Leave any incidence of c untouched.
//E: 'acb' --> 'bca' 'aabacbaa' --> 'bbabcabb'
//P:


function switcheroo(x){
    //split
    let x1 = x.split('')
    console.log(x1)
     let x2 = x1.map(item=> {
      if(item =='a'){
        return item = 'b'
      }else if(item =='b'){
        return item = 'a'
      }else{
        return item = 'c'
      }
    });
    return x2.join('')
    }
  console.log(switcheroo('abc'), 'bac');
  console.log(switcheroo('aaabcccbaaa'), 'bbbacccabbb'); 
  console.log(switcheroo('ccccc'), 'ccccc'); 
  // switcheroo('aaabcccbaaa')