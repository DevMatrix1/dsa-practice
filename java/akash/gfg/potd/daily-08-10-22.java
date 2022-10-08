// Problem - Substrings of length k with k-1 distinct elements
//link: https://practice.geeksforgeeks.org/problems/substrings-of-length-k-with-k-1-distinct-elements/1

//Solution - 
//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            int K = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countOfSubstrings(S,K));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countOfSubstrings(String s, int k) {
        // code here
        int n = s.length();
        int i = 0;
        int j = 0;
        
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        while(j < n){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
                
            if(j - i + 1 == k){
                if(map.size() == k - 1){
                    count++;
                }
                int prevFreq = map.get(s.charAt(i));
                if(prevFreq == 1)
                    map.remove(s.charAt(i));
                else 
                    map.put(s.charAt(i), prevFreq - 1);
                    
                i++;
            }
            j++;
        }
        
        return count;
    }
};
