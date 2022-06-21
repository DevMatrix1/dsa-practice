// link- https://workat.tech/problem-solving/practice/maximum-k-substring-vowels

class Solution {

	public int isVowel(char c){
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return 1;
		return 0;
	}
	int maxKSubstringVowels (String s, int k) {
		// add your logic here
		
		int maxSum=0,curSum=0;
		int size=s.length();
		
		for(int i=0;i<k;i++){
			curSum+=isVowel(s.charAt(i));
		}
		
		maxSum=Math.max(curSum,maxSum);
		
		for(int i=k;i<size;i++){
			curSum=curSum+isVowel(s.charAt(i))-isVowel(s.charAt(i-k));
			maxSum=Math.max(curSum,maxSum);
		}
		
		return maxSum;
	}
}