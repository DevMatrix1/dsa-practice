// link- https://workat.tech/problem-solving/practice/median-row-sorted-matrix

class Solution {
	int calculateMedianOfMatrix(int[][] matrix){
	    int N = matrix.length, M = matrix[0].length; 
    
    int MedianFreq = matrix.length*matrix[0].length/2 + 1;
    
    int left = 1, right = 100000, Median=0;
    
    while(left<=right)
    {
        int mid = (left+right)/2, TotalElementsSmallerThanMid = 0;
        
        for(int i=0;i<N;i++)
        {
            int Left = 0, Right = M-1, RowElementsSmallerThanMid = 0;
            
            while(Left <= Right)
            {
                int Mid = (Left + Right)/2;
                
                if(matrix[i][Mid]<=mid) 
                {
                    RowElementsSmallerThanMid = Mid + 1;
                    Left = Mid + 1;
                }
                else Right = Mid - 1;
            }
            
            TotalElementsSmallerThanMid += RowElementsSmallerThanMid;
        }
         
        if(TotalElementsSmallerThanMid < MedianFreq) 
        {
            left = mid + 1;
        }
        
        else 
        { 
            Median = mid;
            right = mid - 1;
        }
        
    }
    
    return Median;
    
	}
}