package string1;

public class String2 {
    public String doubleChar(String str) {
        String str1 = "";
        for (int i = 0;i<str.length();i++){
            str1+=str.charAt(i);
            str1+=str.charAt(i);
        }
        return str1;
    }

}
