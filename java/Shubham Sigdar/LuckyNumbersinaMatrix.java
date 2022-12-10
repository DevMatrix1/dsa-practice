import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();

        for (int row = 0; row < matrix.length; row++) {
            int minCol = minColInRow(matrix, row);
            int value = matrix[row][minCol];
            if (checkIfMaxInCol(matrix, minCol, value)) {
                result.add(value);
            }
        }

        return result;
    }

    static int minColInRow(int[][] matrix, int row) {
        int minIndex = 0, min = matrix[row][minIndex];
        for (int col = 1; col < matrix[row].length; col++) {
            if (matrix[row][col] < min) {
                min = matrix[row][col];
                minIndex = col;
            }
        }
        return minIndex;
    }

    static boolean checkIfMaxInCol(int[][] matrix, int col, int value) {
        for (int row = 0; row < matrix.length; row++) {
            if (matrix[row][col] > value) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] num= { { 7,8 }, { 1,2} };
        System.out.println(luckyNumbers(num));
    }
}
