// link- https://workat.tech/problem-solving/practice/is-perfect-square

class Solution {
	boolean search(int num,long low,long high){
		if(low<=high){
			long mid=low+(high-low)/2;
			long square=mid*mid;
			if(square==num){
				return true;
			}
			else if(num<square){
				return search(num,low,mid-1);
			}
			return search(num,mid+1,high);
		}
		return false;
	}
	
	boolean isPerfectSquare (int num) {
		// add your logic here
		if(num==1) return true;
		return search(num,2,num/2);

	}
}