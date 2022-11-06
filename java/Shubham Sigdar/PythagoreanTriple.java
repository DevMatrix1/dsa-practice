//Given an array of 3 non-negative integers a, b and c, determine if they form a pythagorean triple.
//
//        A pythagorean triple is formed when:
//
//        c2 = a2 + b2
//        where c is the largest value of a, b, c.
//
//        For example: a = 3, b = 4, c = 5 forms a pythagorean triple, because 52 = 32 + 42
//
//        Return Values
//        1 if a, b and c form a pythagorean triple
//        0 if a, b and c do not form a pythagorean triple
//        For Python: return True or False
//        For JavaScript: return true or false
public class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple){

        int a= triple[0]* triple[0] +  triple[1]* triple[1];
        int b=triple[2]* triple[2];
        if(b==a){
            return 1;
        }else{
            return 0;
        }
    }
}
