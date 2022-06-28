// link- https://workat.tech/problem-solving/practice/square-root

class Solution {
	int searchRoot (int num) {
		// add your logic here
		if (num < 2) {
            return num;
        }
 
        // to store floor of `sqrt(x)`
        int result = 0;
		int low=1,high=num/2;
		while(low<=high){
            long mid=low+(high-low)/2;
            long  square=mid*mid;
            if(square==num) {
                return (int)mid;
            }
            else if(square<0 || square>num){
                high=(int)mid-1;
            }
            else {
                low=(int) mid+1;
                result=(int)mid;
            }
        }
        return result;

	}
}