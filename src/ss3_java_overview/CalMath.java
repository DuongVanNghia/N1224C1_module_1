package ss3_java_overview;

import java.util.Scanner;

public class CalMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = sc.nextInt();
        System.out.print("nhap b: ");
        int b = sc.nextInt();
        System.out.println("tong cua phep tinh " + a + " + " + b + " = " + (a + b));
        System.out.println("hieu cua phep tinh " + a + " - " + b + " = " + (a - b));
        System.out.println("tich cua phep tinh " + a + " * " + b + " = " + (a * b));
        System.out.println("thuong cua phep tinh " + a + " / " + b + " = " + ((double) a / b));
    }
}
