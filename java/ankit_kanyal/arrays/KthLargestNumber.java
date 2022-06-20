// link- https://workat.tech/problem-solving/practice/kth-largest-element

class Solution {
	int getKthLargestElement(int[] list, int k) {
	    // add your logic here
Arrays.sort(list);
		int position=list.length-k;
		return list[position];
	}
}