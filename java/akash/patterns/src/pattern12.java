public class pattern12 {
    public static void main(String[] args) {
        System.out.println("Pattern 11:");
        int n = 4;
        for(int i = 1; i<=n; i++) {
            int num = 0;
            int spaces = 8 - (i*2);
            for(int j = 1; j<=8; j++){
                if(j > 5){
                    num--;
                } else if(j < 5){
                    num++;
                }
                if(j <= i || j > i+spaces){
                    System.out.print(num);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
