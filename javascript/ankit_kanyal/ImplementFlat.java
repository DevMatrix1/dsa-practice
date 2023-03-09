// link- https://bigfrontend.dev/problem/implement-Array-prototype.flat

function flat(arr, depth = 1) {
  // your imeplementation here
  return arr.reduce((result,cur)=>{
    if(Array.isArray(cur) && depth>0){
      result.push(...flat(cur,depth-1));
    }
    else result.push(cur);
    return result;
  },[])
}

// 2nd approach

function flat(arr, depth = 1) {
  // your imeplementation here
  const result=[];
  for(let elm of arr){
    if(Array.isArray(elm) && depth>0){
      result.push(...flat(elm,depth-1));
    }
    else result.push(elm);
  }
  return result;
}
