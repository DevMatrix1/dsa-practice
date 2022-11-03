public class ANeedleintheHaystack {
    public static String findNeedle(Object[] haystack) {
        // Your code here
        String a="";
        for(int i=0;i<haystack.length;i++){
            if(haystack[i]=="needle"){
                a = String.format("found the needle at position %d",i);
            }
        }
        return a;
    }
//    public static String findNeedle(Object[] haystack) {
//        return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
//    }
}
