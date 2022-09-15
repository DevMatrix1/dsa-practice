import java.util.Scanner;

public class second_friend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
   
        for(int i = 1; i<=t; i++){
            int row = sc.nextInt();
            int col = sc.nextInt();
            int count_trees = 0;
            
            for(int j = 1; j<=row; j++){
                String str = sc.next();
                for(int idx = 0; idx<str.length(); idx++){
                    if(str.charAt(idx) == '^')
                        count_trees++;
                }
            }
            
            if(count_trees == 0 || ( row >= 2 && col >= 2)) {
                System.out.println("Case #"+i+": Possible");
                char toPrint = '.';
                if(count_trees > 0)
                    toPrint = '^';
                    
                for(int r = 0; r<row; r++){
                    for(int c = 0; c<col; c++){
                        System.out.print(toPrint);
                    }
                    System.out.println();
                }
                
            }
            else 
                System.out.println("Case #"+i+": Impossible");
        }
    
        sc.close();
    }
}
