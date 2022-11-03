//Write a function which calculates the average of the numbers in a given list.
//
//        Note: Empty arrays should return 0.
public class Calculateaverage {
    public static double find_average(int[] array){
        double sum=0;
        if(array.length==0){
            return 0;
        }else{
            for(int i=0;i<array.length;i++){
                sum+=array[i];
            }
        }
        return sum/array.length;
//        return Arrays.stream(array).average().orElse(0);
    }
}
