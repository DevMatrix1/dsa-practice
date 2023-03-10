// link- https://bigfrontend.dev/problem/implement-basic-throttle

function throttle(func, wait) {
  
  let timer = null;
  // Not that this question is slightly different where you have to save the arguments of the
  // last throttled call
  let lastArgs = [];
  
  return function throttledFunc(...args) {
    // Initial case timer would be null, so this would get invoked
    if(timer == null) {
      // Call the underlying function, then setup the timer
      func.apply(this, args);
      timer = setTimeout(() => {
        // If there were throttled calls, run the function post timer
        // with the saved arguments
        if(lastArgs.length) {
          func.apply(this, lastArgs);
        }
        // Back to initial condition
        timer = null;
        lastArgs = [];
      }, wait);
    }
    else {
      // Function is throttled, no call, just save the arguments and do nothing else.
      lastArgs = args;
      return;
    }
  }
}
