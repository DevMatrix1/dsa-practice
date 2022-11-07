public class FSeries {
    public static void main(String[] args) {
        int n1=0;
        int n3=0;
        System.out.println(n1);
        int n2=1;
        System.out.println(n2);
        for (int i = 2; i < 8; i++) {
            n3=n2+n1;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }

    }
}
