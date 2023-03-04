// link- https://bigfrontend.dev/problem/undefined-to-null

function undefinedToNull(arg) {
  // your code here
  // base case if arg is undefined return null;
  if(arg===undefined) return null;
  else if(Array.isArray(arg)){
    return arg.map(undefinedToNull);
  }

  else if(Object.prototype.toString.call(arg)==='[object Object]'){
    return Object.keys(arg).reduce((acc,currentKey)=>({
      ...acc,
      [currentKey]:undefinedToNull(arg[currentKey])
    }),{});
  }
  
  else return arg;
  
}

