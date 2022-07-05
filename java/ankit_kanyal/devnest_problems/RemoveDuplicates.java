// link- https://devsnest.in/algo-challenges/remove-duplicates-from-sorted-array

static int[] solve(int n, int[] arr){
//CODE HERE 
HashSet<Integer> set=new LinkedHashSet<>();
for(int i:arr){
    set.add(i);
}
return set.stream().mapToInt(Integer::intValue).toArray();
}