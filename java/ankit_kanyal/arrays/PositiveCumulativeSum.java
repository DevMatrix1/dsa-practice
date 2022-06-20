//link-https://workat.tech/problem-solving/practice/positive-cumulative-sum

class Solution {
	List<Integer> getPositiveCumulativeSum (int[] arr) {
		// add your logic here
		List<Integer> li=new ArrayList<>();
		if(arr[0]>0) li.add(arr[0]);
		
		for(int i=1;i<arr.length;i++){
			int pos=arr[i-1]+arr[i];
			arr[i]=pos;
			if(pos>0) li.add(pos);
		}
		
		return li;
	}
}