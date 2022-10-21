// link- https://leetcode.com/problems/find-original-array-from-doubled-array/

// solution- https://leetcode.com/problems/find-original-array-from-doubled-array/discuss/1470998/Java-or-2-Approaches-Sorting-and-without-Sorting-and-then-check-Frequency

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length, i = 0;
        if (n % 2 == 1) return new int[0];
        int[] res = new int[n / 2];
        Map<Integer, Integer> map = new TreeMap<>();
        for (int elm : changed)
            map.put(elm, map.getOrDefault(elm, 0) + 1);
        for (int key : map.keySet()) {
            if (map.get(key) > map.getOrDefault(key+key, 0))
                return new int[0];
            for (int j = 0; j < map.get(key); j++) {
                res[i++] = key;
                map.put(key+key, map.get(key+key) - 1);
            }
        }
        return res;
        
    }
}


class Solution {
    public int[] findOriginalArray(int[] changed) {
        
            
        if(changed.length%2!=0) return new int[0];
        
        int mid = changed.length/2;
        
        int[] res = new int[mid];
        
        int[] freq = new int[100001];
        
        for(int no : changed)
            freq[no]++;
        
        
        int idx=0;
        
        for(int no=0; no<freq.length; no++){
            
            while(freq[no] > 0 && no*2 < 100001 && freq[no*2]>0){
                freq[no]--;
                freq[no*2]--;
                res[idx++] = no;
            }
        }
        
        for(int i=0; i<freq.length; i++){
            if(freq[i]!=0) return new int[0];
        }
        
        return res;
        

    }
}