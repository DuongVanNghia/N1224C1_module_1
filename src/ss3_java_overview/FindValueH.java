package ss3_java_overview;

public class FindValueH {
    public static void main(String[] args) {
        int a = 10;
        a += a++ + ++a;
        System.out.println("a=" + a);
    }
}
