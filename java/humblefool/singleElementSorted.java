/*Single Element in a Sorted Array

You are given a sorted array consisting of only integers where every element appears exactly twice, 
except for one element which appears exactly once.

Return the single element that appears only once.

Example :-  Input: nums = [1,1,2,3,3,4,4,8,8]
            Output: 2
 */

 import java.util.Scanner;

 public class singleElementSorted{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n =sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
         System.out.println(singleNonDuplicate(nums));
    }
    public static int singleNonDuplicate(int[] nums) 
    {   
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
 }