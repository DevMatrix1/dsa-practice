// link- https://devsnest.in/algo-challenges/remove-duplicate-letters

// discussion- https://devsnest.in/algo-challenges/remove-duplicate-letters

static String solve(String s){
//CODE HERE 
    int alphabets[]=new int[26];
    int visited[]=new int[26];

    for (int i = 0; i < 26; i++){
            alphabets[i] = 0;
            visited[i] = 0;      //false
        }
    for(char ch:s.toCharArray()){
        int no=(int)ch-97;
        alphabets[no]+=1;
    }

    String ans="";
    

    for(char ch:s.toCharArray()){
        int index=ch-97;
        alphabets[index]--;


        if(visited[index]==1) continue;

        while(!ans.equals("") && ch<ans.charAt(ans.length()-1) && alphabets[ans.charAt(ans.length()-1)-97]>0){
            visited[ans.charAt(ans.length()-1)-97]=0;
            ans=ans.substring(0,ans.length()-1);
        }
        ans+=ch;
        visited[index]=1;
    }

    return ans;
}