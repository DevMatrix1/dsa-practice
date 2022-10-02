package Sorting.MergeSort;

import java.util.Arrays;

public class Merge {

    public static int[] merge(int[] array1, int[] array2){
        int[] combined=new int[array1.length+ array2.length];
        int index=0;
        int i=0;
        int j=0;

        while (i< array1.length && j< array2.length){
            if (array1[i]<array2[j]){
                combined[index]=array1[i];
                index++;
                i++;
            }else {
                combined[index]=array2[j];
                index++;
                j++;
            }
        }
        while (i< array1.length){
            combined[index]=array1[i];
            index++;
            i++;
        }
        while (j< array2.length){
            combined[index]=array2[j];
            index++;
            j++;
        }
        return combined;
    }


    public static void main(String[] args) {
        int[] array1={12,34,67,67,89};
        int[] array2={5,7,8,9,10,56,78};
        System.out.println(Arrays.toString(merge(array1,array2)));
    }
}
