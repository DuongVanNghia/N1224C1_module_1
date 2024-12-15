package d2_homework;

import java.util.Scanner;

public class DecimalFumFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n : ");
        int n = sc.nextInt();
        double sum = 0;
        int fact = 1;
        int a = 1;
        while (a <= n) {
            sum = sum + 1.0 / fact;
            fact *= (2 * a) * (2 * a + 1);
            a++;
        }
        System.out.println(sum);
    }

}
