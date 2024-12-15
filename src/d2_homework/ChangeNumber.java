package d2_homework;

public class ChangeNumber {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        //  int temp=a;
        // a=b;
        // b=temp;
        //c2
        a = a + b;//a=5
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
