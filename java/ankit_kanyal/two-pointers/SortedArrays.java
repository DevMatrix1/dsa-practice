// link- https://workat.tech/problem-solving/practice/kth-two-sorted

class Solution {
	int getKthElement(int[] firstArr, int[] secondArr, int k) {
	   // add logic here
		int left=0;
		int right=0;
		
		int ans=0;
		int curIndex=0;
		
		while(left<firstArr.length && right<secondArr.length){
			int leftValue=firstArr[left];
			int rightValue=secondArr[right];
			
			curIndex++;
			
			if(leftValue>rightValue){
				ans=rightValue;
				right++;
			}
			else{
				ans=leftValue;
				left++;
			}

			if(curIndex==k) return ans;
		}
		
		if(left==firstArr.length){
			while(right<secondArr.length && curIndex<k){
				ans=secondArr[right];
				right++;
				curIndex++;
			}
		}

		else{
			while(left<firstArr.length && curIndex<k){
				ans=firstArr[left];
				left++;
				curIndex++;
			}
		}

		return ans;
	}
}