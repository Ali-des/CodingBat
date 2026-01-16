package string1;

public class helloName {
    public static void main(String[] args) {
        helloName helloName = new helloName();
        System.out.println(helloName.helloName("Ali"));
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }

    public String extraEnd(String str) {
        return str.substring(str.length() - 2, str.length()) +
                str.substring(str.length() - 2, str.length()) +
                str.substring(str.length() - 2, str.length());
    }

    public String firstTwo(String str) {

        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }
    public String nonStart(String a, String b) {
        return a.substring(1)+b.substring(1);
    }
    public String left2(String str) {
        String two=str.substring(0,2);
        return str.substring(2)+two;
    }
    public String right2(String str) {
        if (str.length()>=2){
            return str.substring(str.length()-2)+str.substring(0,str.length()-2);
        }else {
            return str;
        }
    }
    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }
    public String withouEnd2(String str) {
        if (str.length()<=2){
            return "";
        } else if (str.length()>2) {
            return str.substring(1,str.length()-1);
        }
        return str;
    }
    public String middleTwo(String str) {
        return str.substring(str.length()/2-1,str.length()/2+1);

    }
    public boolean endsLy(String str) {
        if (str.endsWith("ly")){
            return true;
        }else{
            return false;
        }
    }
    public String nTwice(String str, int n) {
        String first = str.substring(0, n);
        String last = str.substring(str.length() - n);
        return first + last;
    }
    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
    public String middleThree(String str) {
        if (str.length()==3){
            return str;
        } else  {
            return str.substring(str.length()/2-1,str.length()/2+2);
        }
    }
    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
    public String atFirst(String str) {
        if(str.length()>=2){
            return str.substring(0,2);
        }else if(str.length()==1){
            return str+"@";
        }else if(str.length()==0)
            return "@@";
        return str;
    }
    public String lastChars(String a, String b) {

        char first;
        char last;
        if (a.length() == 0) {
            first = '@';
        } else {
            first = a.charAt(0);
        }
        if (b.length() == 0) {
            last = '@';
        } else {
            last = b.charAt(b.length() - 1);
        }
        return "" + first + last;
    }
    public String conCat(String a, String b) {
        if (a.isEmpty()||b.isEmpty()){
            return a+b;
        }
        char l = a.charAt(a.length()-1);
        char f = b.charAt(0);
        if (l == f) {
            return a + b.substring(1);
        }return a+b;
    }
    public String lastTwo(String str) {
        if (str.length()>1){
            return str.substring(0,str.length()-2)+str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1);
        }else {
            return str;
        }

    }
    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }
    public boolean frontAgain(String str) {
        if (str.length() < 2) {
            return false;
        }

        String first2 = str.substring(0, 2);
        String last2 = str.substring(str.length() - 2);
        return first2.equals(last2);
    }
    public String minCat(String a, String b) {
        return a.substring(a.length()-2)+b;
    }
    public String extraFront(String str) {
        if (str.length()==1){
            return str+str+str;
        }else if (str.length()==0){
            return str;
        }else {
            return str.substring(0,2)+str.substring(0,2)+str.substring(0,2);
        }
    }
    public String without2(String str) {
        if(str.startsWith(str)==str.endsWith(str)){
            return str.substring(2);
        } else {
            return str;
        }

    }
    public String startWord(String str, String word) {
        int len = word.length();
        if (str.length() < len) {return "";
        }
        if (str.substring(1, len).equals(word.substring(1))) {
            return str.substring(0, len);
        }return "";
    }
    public String withoutX(String str) {
        if (str.startsWith("x")){
            return str.substring(0,str.length()-1);
        } else if (str.endsWith("x")) {
            return str.substring(2);
        }return str;
    }
    public String withoutX2(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) != 'x') {
            result += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) != 'x') {
            result += str.charAt(1);
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }
}
