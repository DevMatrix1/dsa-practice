// link- https://workat.tech/problem-solving/practice/trapped-rain-water

class Solution {
	int volumeOfTrappedRainWater(int[] heights) {
	    // add your logic here
		int size=heights.length;
		int []left=new int[size];
		int [] right=new int[size];
		left[0]=heights[0];
		right[size-1]=heights[size-1];
		for(int i=1;i<size;i++){
			left[i]=Math.max(heights[i],left[i-1]);
		}
		
		for(int i=size-2;i>=0;i--){
			right[i]=Math.max(heights[i],right[i+1]);
		}

		int ans=0;
		
		for(int i=1;i<size-1;i++){
			ans+=Math.min(left[i],right[i])-heights[i];
		}
		
		return ans;
	}
}