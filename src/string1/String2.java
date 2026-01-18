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
    public boolean catDog(String str) {
        int c=0;
        int d=0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i,i+3).equals("cat")){
                c++;
            }
            if (str.substring(i,i+3).equals("dog")){
                d++;
            }
        }
        if (c==d){
            return true;
        }else {
            return false;
        }
    }
    public int countCode(String str) {
        int count=0;
        for (int i = 0; i < str.length()-3; i++) {
            if (str.substring(i,i+4).matches("co.e")){
                count++;
            }
        }return count;
    }
    public boolean endOther(String a, String b) {
        if (a.length() < b.length()){
            String temp =a;
            a=b.toLowerCase();
            b=temp.toLowerCase();
        }
        return a.substring(a.length()-b.length()).equals(b);
    }

}
