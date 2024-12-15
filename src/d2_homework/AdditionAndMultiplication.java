package d2_homework;

import java.util.Scanner;

public class AdditionAndMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int s = 0;
        int p = 1;
        while (n > 0) {
            int digit = n % 10;
            s = s + digit;
            p = p * digit;
            n = n / 10;
        }
        System.out.printf("tong cua so nhap %d = %d\n ", n, s);
        System.out.printf("tich cua so nhap %d = %d\n ", n, p);

    }
}
