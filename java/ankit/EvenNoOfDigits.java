//link-https://workat.tech/problem-solving/practice/even-number-of-digits

class Solution {
	
	public static int calculateLength(int number){
        int len=0;
        while(number!=0){
            len++;
            number/=10;
        }
        return len;
    }

    static List<Integer> getEvenDigitNumbers (int[] arr) {
        // add your logic here

        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            int number=arr[i];
            int len=calculateLength(number);
            if(len%2==0 && number!=0){
                li.add(number);
            }
        }

        return li;
    }
}