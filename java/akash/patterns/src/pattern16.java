public class pattern16 {
    public static void main(String[] args) {
        /*
            Pattern

            A
            BB
            CCC
            DDDD
            EEEEE

        */

        int lines = 5; // no. of lines the pattern will take
        int asciiOfToPrint = 65; //ascii value of "A" is 65

        for(int row=1; row<=lines; row++){
            for(int cols=1; cols<=row; cols++){
                System.out.print((char)(asciiOfToPrint)); // 65 -> 'A'
            }
            System.out.println();
            asciiOfToPrint++;
        }

    }
}
