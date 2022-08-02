int binaryS(vector<int> &nums, int l , int h, int target){
    int mid = l+(h-l)/2;
    if(l <= h){
       if(nums[mid]==target)
         return mid;
        else if(nums[mid]>target)
         return binaryS(nums, l, mid-1, target);
        else
          return binaryS(nums, mid+1, h, target); 
     }
    return -1;   
}