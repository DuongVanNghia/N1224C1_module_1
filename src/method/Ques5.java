package method;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương:");
        int n = sc.nextInt();

        System.out.printf("%d số phần tử của dãy Fibonacci: ", n);
        fibonacci(n);
    }

    static void fibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        if (n <= 0) {
            System.out.println("Số nhập vào phải lớn hơn 0!");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(f1 + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;

        }
    }
}
