package d3_homework.checknumber;

import java.util.Scanner;

public class NumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int isPrime = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime++;
            }
        }
        if (isPrime >= 1) {
            System.out.println("khong phai la so nguyen to");
        } else {
            System.out.println("la so nguyen to");
        }
    }
}
