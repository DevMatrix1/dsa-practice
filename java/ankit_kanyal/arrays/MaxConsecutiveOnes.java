// link- https://workat.tech/problem-solving/practice/max-consecutive-ones

class Solution {
	int getMaxConsecutiveOnes(int[] A) {
	    // add your logic here
		int maxCount=0;
		int tempCount=0;
		for(int i=0;i<A.length;i++){
			if(A[i]==1){
				tempCount++;
			}
			else{
				maxCount=Math.max(tempCount,maxCount);
				tempCount=0;
			}
		}
		maxCount=Math.max(tempCount,maxCount);
		return maxCount;
	}
}