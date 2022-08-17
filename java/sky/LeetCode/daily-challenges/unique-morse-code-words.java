//link: https://leetcode.com/problems/unique-morse-code-words/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] table = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> transformations = new HashSet<>();
        for(String str: words){
            int n = str.length();
            StringBuilder cur_code = new StringBuilder();
            for(int i = 0; i<n; i++){
                cur_code.append(table[str.charAt(i) - 'a']);
            }
            transformations.add(cur_code.toString());
        }
        
        return transformations.size();
    }
}