// link- https://devsnest.in/algo-challenges/deck-of-cards

static int solve(int n, int[] deck){
//CODE HERE 
    int len = deck.length;
    if(len == 1) return 0;
        
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i:deck) {
        if(map.containsKey(i)) map.put(i, map.get(i)+1);
        else map.put(i,1);
    }
        
        
    int min = map.get(deck[0]);        
    for(int i:map.values()) min = gcd(min,i);
    if(min!=1) return 1;
    return 0;
    
}

 public static int gcd(int n1,int n2){
        if(n2!=0) return gcd(n2,n1%n2);
        return n1;
    }