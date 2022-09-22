public class pattern14 {
    public static void main(String[] args) {
        /*
            Pattern

            A
            AB
            ABC
            ABCD
            ABCDE

        */

        int lines = 5; // no. of lines the pattern will take

        for(int row=1; row<=lines; row++){
            int asciiOfToPrint = 65; //ascii value of "A" is 65
            for(int cols=1; cols<=row; cols++){
                System.out.print((char)(asciiOfToPrint)); // 65 -> 'A'
                asciiOfToPrint++;
            }
            System.out.println();
        }

    }
}
