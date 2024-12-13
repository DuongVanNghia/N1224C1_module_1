package ss5_loop;

import java.util.Scanner;

public class PrintEven2Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        System.out.println("day so do la: ");
        for (int i = 2; i <= 2 * n; i += 2) {
            System.out.print(i + " ");
        }
    }
}
