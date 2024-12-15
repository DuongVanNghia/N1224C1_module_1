package d2_homework;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = sc.nextInt();
        System.out.print("nhap b: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a la max");
            System.out.println("b la min");
        } else {
            System.out.println("b la max");
            System.out.println("a la min");
        }
    }
}
