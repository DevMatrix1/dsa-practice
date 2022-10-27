//Simple, remove the spaces from the string, then return the resultant string.

public class RemoveStringSpaces {
    public static String noSpace(final String str) {
        //create array of character
        char[] strArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i] != ' ') {
                stringBuffer.append(strArray[i]);
            }
        }
        String noSpaceStr2 = stringBuffer.toString();
        return noSpaceStr2;
    }
}
//another way to do that
// return x.replaceAll(" ","")