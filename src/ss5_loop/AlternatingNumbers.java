package ss5_loop;

import java.util.Scanner;

public class AlternatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        System.out.print("day so tren la: ");
        for (int i = 2; i <= n; i += 2) {
            if (i % 6 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
