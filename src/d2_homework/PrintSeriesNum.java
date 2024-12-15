package d2_homework;

import java.util.Scanner;

public class PrintSeriesNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        System.out.print("day so tren la: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(" " + i);
        }
    }
}
