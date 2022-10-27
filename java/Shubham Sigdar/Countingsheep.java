//Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).
//
//        For example,
//
//        [true,  true,  true,  false,
//        true,  true,  true,  true ,
//        true,  false, true,  false,
//        true,  false, false, true ,
//        true,  true,  true,  true ,
//        false, false, true,  true]
public class Countingsheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count=0;
        for(Boolean i:arrayOfSheeps){
            if(i!=null && i==true){
                count=count+1;
            }
        }
        return count;
    }

}
