//    In fibonacci series, next number is the sum of previous two numbers
//    for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
//    The first two numbers of fibonacci series are 0 and 1.
public class Fibonacciserieswithrecursion {
    static int n1=0,n2=1,n3,count;
    public static void main(String[] args) {
        int count=10;
        printfibonacci(count-2);
    }

    private static void printfibonacci(int i) {
        if(i>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            printfibonacci(i-1);

        }
    }

}
