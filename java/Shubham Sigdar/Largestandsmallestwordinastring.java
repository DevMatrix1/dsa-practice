// package DSA.Array;

//In this program, we need to find the smallest and the largest word present in the string
//string="Hardships often prepare ordinary people for an extraordinary destiny"
//Smallest word: an Largest word: extraordinary

public class Largestandsmallestwordinastring {
    public static void main(String[] args) {
        String str="Hardships often prepare ordinary people for an extraordinary destiny";
        String[] newStr=str.split(" ");
        String min = newStr[0],max = "";
        for (String i:newStr) {
            if(i.length() < min.length()){
                min=i;
            }else if(i.length() > max.length()){
                max=i;
            }
        }
        System.out.println("min "+ min);
        System.out.println("max "+ max);
    }
}
