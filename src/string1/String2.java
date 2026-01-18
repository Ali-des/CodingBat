package string1;

public class String2 {
    public String doubleChar(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            str1 += str.charAt(i);
            str1 += str.charAt(i);
        }
        return str1;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public boolean catDog(String str) {
        int c = 0;
        int d = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                c++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                d++;
            }
        }
        if (c == d) {
            return true;
        } else {
            return false;
        }
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 4).matches("co.e")) {
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b.toLowerCase();
            b = temp.toLowerCase();
        }
        return a.substring(a.length() - b.length()).equals(b);
    }

    public boolean xyzThere(String str) {
        if (str.length() < 3) return false;
        if (str.indexOf("xyz") == 0) return true;
        for (int i = 1; i < str.length() - 3; i++) {
            String temp = str.substring(i, i + 3);
            if (temp.equals("xyz") && str.charAt(i - 1) != '.')
                return true;
        }
        return true;
    }

    public boolean bobThere(String str) {
        if (str.length() > 2 && str.length() < 8) {
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
            }
            return false;
        } else if (str.length() > 10) {
            return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        int x = str.lastIndexOf('x');
        int y = str.lastIndexOf('y');
        return x <= y;
    }

    public String mixString(String a, String b) {
        String result = "";
        int i = 0;

        while (i < a.length() || i < b.length()) {
            if (i < a.length()) {
                result += a.charAt(i);
            }
            if (i < b.length()) {
                result += b.charAt(i);
            }
            i++;
        }
        return result;
    }


}
