// link- https://devsnest.in/algo-challenges/valid-anagram

static int solve(String s1, String s2){
//CODE HERE 
Map<Character,Integer> charCount1=new HashMap<>();
Map<Character,Integer> charCount2=new HashMap<>();
if(s1.length()!=s2.length()) return 0;
for(char c:s1.toCharArray()){
    charCount1.put(c,charCount1.getOrDefault(c,0)+1);
}
for(char c:s2.toCharArray()){
    charCount2.put(c,charCount2.getOrDefault(c,0)+1);
}

for(Map.Entry entry:charCount2.entrySet()){
    Character key=(Character)entry.getKey();
    Integer value=(Integer)entry.getValue();
    // System.out.println("key "+key+" value "+value);
    if(!charCount1.containsKey(key) || charCount1.get(key)<value) return 0;
}
return 1;
}