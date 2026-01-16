package string1;

public class helloName {
    public static void main(String[] args) {
        helloName helloName = new helloName();
        System.out.println(helloName.helloName("Ali"));
    }
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
}
