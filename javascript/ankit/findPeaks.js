function pickPeaks(arr) {
  let isMaximaAvailable = false;

  let curMax = arr[0];
  let curMaxPos = 0;
  let pos = [];
  let peaks = [];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > curMax) {
      curMax = arr[i];
      curMaxPos = i;
      isMaximaAvailable = true;
    } else {
      if (arr[i] == curMax) continue;
      console.log(arr[i]);
      if (isMaximaAvailable) {
        pos.push(curMaxPos);
        peaks.push(curMax);
        isMaximaAvailable = false;
      }
      curMaxPos = i;
      curMax = arr[i];
    }
  }

  let ans = {
    pos: pos,
    peaks: peaks,
  };

  return ans;
}
