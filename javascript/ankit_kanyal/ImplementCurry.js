// https://bigfrontend.dev/problem/implement-curry

function curry(fn) {
  // your code here
  return function curried(...arg){
    if(arg.length>=fn.length){
      return fn.call(this,...arg);
    }
    return curried.bind(this,...arg);
  }
}
