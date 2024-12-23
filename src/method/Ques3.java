package method;

import java.util.Scanner;

public class Ques3 {
    static int calSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int calSumTotal(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    static double calSumFractions(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    static int calMultiply(int n) {
        int Multiply = 1;
        for (int i = 1; i <= n; i++) {
            Multiply *= i;
        }
        return Multiply;
    }

    static int sumFactorial(int n) {
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        return sum;


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = s.nextInt();
        System.out.println("cau a: " + calSum(n));
        System.out.println("Cau b: " + calSumTotal(n));
        System.out.println("Cau c: " + calSumFractions(n));
        System.out.println("Cau d: " + calMultiply(n));
        System.out.println("Cau e: " + sumFactorial(n));
    }
}
