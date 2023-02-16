import java.util.*;

public class medianoftwoMergeArrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num1[]=new int [n];
        int num2[]=new int[m];
        for(int i=0;i<n;i++){
            num1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            num2[i]=sc.nextInt();
        }
        System.out.println(findMedianSortedArrays(num1, num2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
         for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        if(list.size()%2==0){
            return (double) (list.get((list.size()/2)-1)+list.get(list.size()/2))/2;
        }
        else{
            return list.get(list.size()/2);
        }
        
    }
}