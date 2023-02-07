//package humblefool;
import java.util.Scanner;
/*
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * 
 *      Input: nums = [2,5,1,3,4,7], n = 3
 *      Output: [2,3,5,4,1,7] 
 *      Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */

public class shuffleArray{
    public static int[] shuffle(int[] nums, int n) {
        int arr[]=new int [nums.length];
        int x=0;
        for (int i =0 ;i<n;i++)
        {
            arr[x]=nums[i];
            x+=2;
        } 
        int c=1;
        for(int j=n;j<nums.length;j++)
        {
            arr[c]=nums[j];
            c+=2;
        }  
        return arr;      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int nums[]=new int[2*n];
        for (int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(shuffle(nums, n));
    }

}