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
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+2).equals("hi")){
                count++;
            }
        }
        return count;
    }
}
