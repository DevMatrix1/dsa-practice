var numIdenticalPairs = function(nums) {
    let map={};
    let count=0;
    nums.forEach(num=>{
    //   console.log(map[num])
      if(map[num]){
        count+=map[num]
    //    console.log(count)
        map[num]++;
      }else{
        map[num]=1;
      }
    })
  console.log(map)
  console.log(count)
};
numIdenticalPairs([1,2,3,1,1,3]);