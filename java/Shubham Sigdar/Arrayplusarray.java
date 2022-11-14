//I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.
//
//        P.S. Each array includes only integer numbers. Output is a number too.
public class Arrayplusarray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        int sum=0;
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            sum+=arr2[i];
        }
        return sum;
    }

}
