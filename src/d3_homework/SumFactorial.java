package d3_homework;

import java.util.Scanner;

public class SumFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = sc.nextInt();
        System.out.print("nhap b: ");
        int b = sc.nextInt();
        System.out.print("nhap c: ");
        int c = sc.nextInt();
        int FactorialA = 1;
        int FactorialB = 1;
        int FactorialC = 1;
        for (int i = 1; i <= a; i++) {
            FactorialA = FactorialA * i;
        }
        for (int i = 1; i <= b; i++) {
            FactorialB = FactorialB * i;
        }
        for (int i = 1; i <= c; i++) {
            FactorialC = FactorialC * i;
        }
        System.out.printf("tong cua 3 la: %d+%d+%d=%d", FactorialA, FactorialB, FactorialC, FactorialA + FactorialB + FactorialC);
    }
}
