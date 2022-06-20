// link- https://workat.tech/problem-solving/practice/primes-upto-n

class Solution {
	List<Integer> primesUptoN(int n) {
		List<Integer> li=new ArrayList<Integer>();
		int arr[]=new int[n+1];
	    for(int i=2;i<=n;i++){
			for(int j=2*i;j<=n;j=j+=i){
				arr[j]=-1;
			}
		}
		for(int i=2;i<=n;i++){
			if(arr[i]!=-1){
				li.add(i);
			}
		}
		return li;
	}
}