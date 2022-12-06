// package DSA.Array;

public class Printduplicateelementofanarray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,2,7,8,8,3};
        int[] sum= findDuplicate(arr);
        for (int i: sum){
            if(i!=-1 && i!=0){
                System.out.println(i);
            }
        }
    }

    static int[] findDuplicate(int[] arr) {
        int flag=-1;
        int[] num = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    num[i]=arr[i];
                    num[j]=flag;
                }
            }

        }
        return num;
    }
}
