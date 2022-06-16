const myPromise = Promise.resolve(Promise.resolve("Promise"));

function funcOne() {
  setTimeout(() => console.log("Timeout 1!"), 0);
  myPromise.then((res) => res).then((res) => console.log(`${res} 1!`));
  console.log("Last line 1!");
}

async function funcTwo() {
  const res = await myPromise;
  console.log(`${res} 2!`);
  setTimeout(() => console.log("Timeout 2!"), 0);
  console.log("Last line 2!");
}

funcOne();
funcTwo();

/*  Solution-

Option(C) is correct.

So basically this problem is regarding event loop and how event loops works.

So first the function 1 is pushed into call stack and first log is printed and timeout is sent to macrotask queue and promise is sent to microtask queue.

Then function 2 is pushed into call stack and the res value is calculated as we are awaiting for its value.Then we log its value.

Then the timeout is sent into macrotask queue and log is executed next.

now the call stack is empty then we take values from the microtask queue as it has higher priority over macrotask queue.So promise 1 logged now.

After that we takes values from callback queue(macrotask) in the order it was inserted.So first it will print Timeout 1 and then timeout 2.

*/
