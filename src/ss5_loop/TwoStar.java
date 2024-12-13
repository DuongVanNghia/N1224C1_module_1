package ss5_loop;

import java.util.Scanner;

public class TwoStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int count = 0;
        int disance = 1;
        for (int i = 2; i <= n; i += 2) {
            if (count == disance) {
                System.out.print(-i + "\t");
                count = 0;
                disance++;
            } else {
                System.out.print(i+"\t");
                count++;
            }

        }
    }
}
