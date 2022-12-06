// package DSA.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> num1 = new ArrayList<>();
        int n = num.length;
        int i = n-1;
        while(i>=0 || k>0){
            if(i>=0){
                num1.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            }else{
                num1.add(k%10);
                k=k/10;
            }
            i--;
        }
        Collections.reverse(num1);
        return num1;
    }

}
