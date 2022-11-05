//Given a set of numbers, return the additive inverse of each. Each positive becomes negatives,
// and the negatives become positives.
//
//        invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//        invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//        invert([]) == []

public class Invertvalues {
    public static int[] invert(int[] array) {
        if(array.length==0){
            return new int[]{};
        }
        int[] arr=new int[array.length];
        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                arr[i]=-array[i];
            }else if(array[i]>0){
                arr[i]=-array[i];
            }
        }
        return arr;
    }
}
