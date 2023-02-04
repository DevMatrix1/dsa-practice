/*Question :- Given a number n, count the total number of digits required to
 * write all numbers from 1 to n. 
 * Input: n = 13
 *  Output: 17 
 * Explanation: There are total 17 digits required to write all numbers from 1 to 13.
 */

package humblefool;
import java.util.Scanner;
public class totalDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to count digits form 1 to n");
        long number = sc.nextLong();
        System.out.println(totalDigits(number));
        sc.close();
    }
    public static long totalDigits(long n){
        if (n==1)
        {
            return 1;
        }
        String str=Long.toString(n);//converting long integer into a string c
        return str.length()+totalDigits(n-1);//here we are applying recurrsion to reach n to 1
   }
}
// time complexity of this solution is o(n);
// space complexity is O(1);

/*
 * try to improve this solution into logn-- Time complexity  
 */