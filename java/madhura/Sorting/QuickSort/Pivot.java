package Sorting.QuickSort;

import java.util.Arrays;

public class Pivot {

    private static void swap(int[] array, int firstIndex, int secondIndex){
        int temp=array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    private static int pivot(int[] array, int pivotIndex, int endIndex){
        int swapIndex=pivotIndex;
        for (int i = pivotIndex; i <=endIndex ; i++) {
            if (array[i]<array[pivotIndex]){
                swapIndex++;
                swap(array,swapIndex,i);
            }
        }
        swap(array,pivotIndex,swapIndex);
        return swapIndex;
    }


    public static void main(String[] args) {
        int[] myArray={45,45,21,56,78,43,23};
        System.out.println(pivot(myArray,0,6));
        System.out.println(Arrays.toString(myArray));
    }

}
