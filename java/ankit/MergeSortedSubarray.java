// link-https://workat.tech/problem-solving/practice/merge-sorted-subarrays

class Solution {
	void merge (int[] arr, int endIndex) {
        // add your logic here
        int start=0,secondStart=endIndex+1;
        int len=arr.length-secondStart;
        int index=0;
        int list[]= Arrays.copyOf(arr,arr.length);
        while(start<endIndex+1 && secondStart<arr.length){
            if(list[start]<list[secondStart]){
                arr[index]=list[start];
                start++;
            }
            else{
                arr[index]=list[secondStart];
                secondStart++;
            }
            index++;
        }

        if(start==endIndex+1){
            while(index<arr.length){
                arr[index]=list[secondStart];
                secondStart++;
                index++;
            }
        }

        if(secondStart==arr.length){
            while(index<arr.length){
                arr[index]=list[start];
                start++;
                index++;
            }
        }

    }
}