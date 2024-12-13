package ss4_condition;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = sc.nextInt();
        System.out.print("nhap b: ");
        int b = sc.nextInt();
        int max=(a>b)?a:b;//toan tu
        int min=(a<b)?a:b;
        System.out.println(max);
    }
}
