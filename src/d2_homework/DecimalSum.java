package d2_homework;

import java.util.Scanner;

public class DecimalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        double n = sc.nextInt();
        double sum = 0;
        int a = 1;
        while (a <= n) {
            sum = sum + 1.0 / a;
            a++;
        }

        System.out.print("tong cua day tren la: " + sum);
    }
}
