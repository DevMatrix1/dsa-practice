package sept_12_2022;

import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t = 1; t<=T; t++){
            int n = sc.nextInt();  //no. of digits in string-code
            String code = sc.next();

            char[] arr = code.toCharArray();

            StringBuilder str = new StringBuilder();

            for(int i = n-1; i>=0; i--){
                int ascii = 0;
                if(arr[i] == '0'){
                    ascii = (arr[i-2]-'0')*10;
                    ascii += arr[i-1]-'0';
                    i-=2;
                } else {
                    ascii = arr[i]-'0';
                }

                char c = (char) (96+ascii);
                str.append(c);
            }

            str = str.reverse();
            String ans = str.toString();
            System.out.println(ans);
        }


        sc.close();
    }
}
