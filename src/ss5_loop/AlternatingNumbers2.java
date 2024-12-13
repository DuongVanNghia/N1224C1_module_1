package ss5_loop;

import java.util.Scanner;

public class AlternatingNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            count++;
            if (count % 3 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
