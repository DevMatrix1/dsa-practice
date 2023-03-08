// link- https://bigfrontend.dev/problem/implement-curry-with-placeholder

// 1st version

function curry(fn) {
  return function curried(...args) {
    // if number of arguments match
    if (isArgsMet(args, fn, curry.placeholder)) {
      return fn.call(this, ...args)
    }

    // otherwise return a function which merges the args
    return function (...nextArgs) {
      const mergedArgs = mergeArgs(args, nextArgs, curry.placeholder)
      return curried.call(this, ...mergedArgs)
    }
  }
}
curry.placeholder = Symbol()

function mergeArgs(argsTo, argsFrom, placeholder) {
  const mappedArgsTo = argsTo.map((item) =>
    item === placeholder && argsFrom.length ? argsFrom.shift() : item
  )
  return [...mappedArgsTo, ...argsFrom]
}

function isArgsMet(args, fn, placeholder) {
  if (args.length < fn.length) {
    return false
  }

  return args.slice(0, fn.length).every((item) => item !== placeholder)
}

// 2nd version

function curry(func) {
  return function curried(...args) {
    const complete = args.length >= func.length && !args.slice(0, func.length).includes(curry.placeholder);
    if(complete) return func.apply(this, args)
    return function(...newArgs) {
      // replace placeholders in args with values from newArgs
      const res = args.map(arg => arg === curry.placeholder && newArgs.length ? newArgs.shift() : arg);
      return curried(...res, ...newArgs);
    }
  }
}

curry.placeholder = Symbol()
