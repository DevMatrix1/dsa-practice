// package DSA.Array;

public class Programtofindthefrequencyofeachelementinthearray {
    public static void main(String[] args) {
        int[] arr={1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] num= frequecy(arr);
        for (int i:num) {
            System.out.println(i);
        }
    }

    static int[] frequecy(int[] arr) {
//        int count=0;
        int[] arr1=new int[arr.length];
        int visited=-1;
        for (int i = 0; i <arr.length; i++) {
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr1[j]=visited;
                    System.out.println(arr);
                    count++;

                }
            }
            if(arr1[i]!=visited){
                arr1[i]=count;
            }

        }
        return arr1;
    }
}
