//Given an array of integers your solution should find the smallest integer.
//
//        For example:
//
//        Given [34, 15, 88, 2] your solution will return 2
//        Given [34, -345, -1, 100] your solution will return -345
//        You can assume, for the purpose of this kata, that the supplied array will not be empty.
public class Findthesmallestintegerinthearray {
    public static int findSmallestInt(int[] args) {
        int a=args[0],s;
        for(int i=1;i<args.length;i++){
            if(a>args[i]){
                a=args[i];
            }
        }
        return a;
    }
}

//another way to do
//  Arrays.sort(args);
//  return args[0];