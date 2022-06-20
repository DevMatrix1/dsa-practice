function foo() {
  let a = (b = 0);
  a++;
  return a;
}
foo();
console.log(typeof a);
console.log(typeof b);

/*

Correct answer is -
undefined and number 

*/
