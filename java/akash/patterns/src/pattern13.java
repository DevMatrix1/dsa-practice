import java.net.SocketTimeoutException;

public class pattern13 {
    public static void main(String[] args) {
        // Pattern :
        /*


            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15


        * */

        int n = 5; // n = no. of lines the pattern will take up

        int num = 1;    //num = number that we need to print
        for(int rows = 1; rows<=5; rows++){
            for(int cols = 1; cols<=rows; cols++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(); // to print different rows in different lines :)
        }

    }
}
