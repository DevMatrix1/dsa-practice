//Given an array of integers, return a new array with each value doubled.
//
//        For example:
//
//        [1, 2, 3] --> [2, 4, 6]
public class BeginnerLostWithoutaMap {
    public static int[] map(int[] arr) {
        int[] x=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            x[i]=arr[i]*2;

        }
        return x;
    }
}
