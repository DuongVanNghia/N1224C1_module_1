package d2_homework;

import java.util.Scanner;

public class PlusNumberMinius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        while (a <= n) {
            System.out.print(a * b + " ");
            a = a * 2 + 1;
            b = -b;
        }
    }
}
