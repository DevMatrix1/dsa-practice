// link- https://bigfrontend.dev/problem/implement-throttle-with-leading-and-trailing-option

function throttle(func, wait, option = { leading: true, trailing: true }) {
  var { leading, trailing } = option;
  var lastArgs = null;
  var timer = null;

  const setTimer = () => {
    if (lastArgs && trailing) {
      func.apply(this, lastArgs);
      lastArgs = null;
      timer = setTimeout(setTimer, wait);
    } else {
      timer = null;
    }
  };

  return function (...args) {
    if (!timer) {
      if (leading) {
        func.apply(this, args);
      }
      timer = setTimeout(setTimer, wait);
    } else {
      lastArgs = args;
    }
  }
}
