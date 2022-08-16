//link: https://leetcode.com/problems/substring-with-concatenation-of-all-words/

//Approach 1 : Using HashMap and simple nested loops 

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(var str: words){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        System.out.println(map);
        
        int wordCount = words.length;
        int wordLen = words[0].length();
        int subsLen = wordLen * wordCount;
        
        int n = s.length();
        
        for(int i = 0; i <= n-subsLen; i++){
            HashMap<String, Integer> curMap = new HashMap<>(map);
            int count = 0;
            
            for(int j = i; j < i+subsLen; j += wordLen){
                String curWord = s.substring(j, j+wordLen);
                if(curMap.getOrDefault(curWord, 0) != 0){
                    curMap.put(curWord, curMap.get(curWord) - 1);
                    count++;
                } else {
                    break;
                }
            }
            
            if(count == wordCount){
                list.add(i);
            }
        }

        return list;
    }
}

//Approach 2: Using HashMap and sliding window
