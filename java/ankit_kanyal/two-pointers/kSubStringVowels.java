// link- https://workat.tech/problem-solving/practice/k-substring-vowels

class Solution {
	int[] kSubstringVowels (String s, int k) {
		// add your logic here

		int size=s.length();
		Character[] vow=new Character[]{'a','e','i','o','u'};
		
		List<Character> vowels=new ArrayList<>(Arrays.asList(vow));
		
		int sum=0;
		
		
		for(int i=0;i<k;i++){
			if(vowels.contains(s.charAt(i))){
				sum+=1;
			}
		}
		
		int []arr=new int[size-k+1];
		arr[0]=sum;
		int index=1;
		
		
		for(int i=k;i<size;i++){
			if(vowels.contains(s.charAt(i-k))){
				sum-=1;
			}
			
			if(vowels.contains(s.charAt(i))){
				sum+=1;
			}

			arr[index]=sum;
			index++;
		}

		return arr;

		
	}
}