// package DSA.Array;
//Doubt in arraylist and difference between == and .equals
import java.util.List;

public class CountItemsMatchingaRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int i=-1;
        switch(ruleKey){
            case "type":
                i=0;
                break;
            case "color":
                i=1;
                break;
            default:
                i=2;

        }
        int count=0;
        // int k=i;
        for (List<String> j : items) {
            if(j.get(i).equals(ruleValue)){
                count++;
            }
        }
        return count;

    }
}
