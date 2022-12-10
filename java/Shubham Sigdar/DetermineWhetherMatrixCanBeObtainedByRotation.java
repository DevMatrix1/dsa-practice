// package DSA.Array;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    static void rotate(int[][] mat){
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        int start=0;
        int end=mat.length-1;
        while(start<=end){
            for(int row=0;row<mat.length;row++){
                int temp=mat[row][start];
                mat[row][start]=mat[row][end];
                mat[row][end]=temp;
            }
            start++;
            end--;
        }
    }
    static boolean check(int[][] mat, int[][] target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(check(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
}
