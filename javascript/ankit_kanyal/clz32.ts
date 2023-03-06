// link- https://bigfrontend.dev/problem/clz32

function clz32(num:number):number {
  // this converts a number into the uint32
  num = num >>> 0;
  if (num === 0) return 32;
  return 32 - num.toString(2).length;
}
