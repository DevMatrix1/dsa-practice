//Given :- array, always array have atleast 2no,all unique, ascending
function firstNonConsecutive(arr){
  for(let i=1;i<=arr.length;i++){
    if(i!==arr[i]){
      console.log(arr[i]);
    }
  }
  console.log(null);
}
firstNonConsecutive([1,2,3,4,5,6])