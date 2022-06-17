const one = false || {} || null;
const two = null || false || "";
const three = [] || 0 || true;

console.log(one, two, three);

/*
A: false null []
B: null "" true
C: {} "" []
D: null null true


option(c) is correct as || operator looks for first truthy value if it doesn't found it it returns the last value provided.
*/
