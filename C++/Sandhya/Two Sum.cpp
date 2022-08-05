
vector<int> solve(int n, vector<int> nums, int target){
    
    unordered_map<int,int> hash;
        vector<int> result;
        
        for(int i=0; i<nums.size(); i++ ){
            
            int numbertofind = target - nums[i];

            if(hash.find(numbertofind) != hash.end()){
                result.push_back(hash[numbertofind]);
                result.push_back(i);
                return result;
            }
            hash[nums[i]]= i;
        
        }
        return result;  
    }