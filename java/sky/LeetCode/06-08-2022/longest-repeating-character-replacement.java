//link: https://leetcode.com/problems/longest-repeating-character-replacement/

//Algorithm 1: using hashmap and sliding window
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0; 
        int maxC = 0;
        int ans = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        
        while(j < n){
            char charj = s.charAt(j);
            freq.put(charj, freq.getOrDefault(charj, 0) + 1);
            maxC = Math.max(maxC, freq.get(charj));
            int curLen = j - i + 1;
            
            if(curLen - maxC > k){
                char chari = s.charAt(i);
                freq.put(chari, freq.get(chari)-1);
                i++;
            }
            curLen = j - i + 1;
            ans = Math.max(ans, curLen);
            j++;
        }
        
        return ans;
    }
}

//Algorithm 2: using sliding window and freq[26] for character freq.
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int i = 0;
        int j = 0; 
        int maxC = 0;
        int ans = 0;
        int []freq = new int[26];
        
        while(j < n){
            char charj = s.charAt(j);
            freq[charj-'A']++;
            maxC = Math.max(maxC, freq[charj-'A']);
            int curLen = j - i + 1;
            
            if(curLen - maxC > k){
                char chari = s.charAt(i);
                freq[chari-'A']--;
                i++;
            }
            curLen = j - i + 1;
            ans = Math.max(ans, curLen);
            j++;
        }
        
        return ans;
    }
}