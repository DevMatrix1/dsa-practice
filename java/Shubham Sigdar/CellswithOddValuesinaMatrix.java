// package DSA.Array;

public class CellswithOddValuesinaMatrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];

        for(int i=0;i<indices.length;i++){
            for(int j=0;j<n;j++){
                arr[indices[i][0]][j]++;
            }
            for(int j=0;j<m;j++){
                arr[j][indices[i][1]]++;
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        return count;
    }
}
