// link- https://workat.tech/problem-solving/practice/pascals-triangle

class Solution {
	
	int[] pascalTriangleRow(int rowNo) {
		int [] curRow=new int[rowNo];
		curRow[0]=1;
		if(rowNo==1){
			return new int[]{1};
		}
		int [] preRow=pascalTriangleRow(rowNo-1);
		for(int i=1;i<rowNo-1;i++){
			curRow[i]=preRow[i]+preRow[i-1];
		}
		
		curRow[rowNo-1]=1;
		return curRow;
	}
}