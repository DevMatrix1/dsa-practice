// link- https://leetcode.com/problems/next-permutation/

var nextPermutation = function(nums) {
    let index=nums.length-2;
    while(index>=0 && nums[index]>=nums[index+1]) index--;
    if(index>=0){
        let j=nums.length-1;
        while(nums[j]<=nums[index]) j--;
        swap(nums,index,j);
    }
    reverse(nums,index+1,nums.length-1);
    
};

const swap=(arr,i,j)=>{
    let temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}

const reverse=(arr,i,j)=>{
    while(i<j) swap(arr,i++,j--);
}
