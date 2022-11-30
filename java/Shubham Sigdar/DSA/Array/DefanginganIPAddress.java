package DSA.Array;
//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//        A defanged IP address replaces every period "." with "[.]".
//
//
//
//        Example 1:
//
//        Input: address = "1.1.1.1"
//        Output: "1[.]1[.]1[.]1"
//        Example 2:
//
//        Input: address = "255.100.50.0"
//        Output: "255[.]100[.]50[.]0"
public class DefanginganIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                s.append("[.]");
            }else{
                s.append(address.charAt(i));
            }
        }
        return s.toString();

    }
}
