package d2_homework;

import java.util.Scanner;

public class SquareNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so muon nhap: ");
        double n = sc.nextDouble();
        double sqrt = Math.sqrt(n);
        if (sqrt % 1 == 0) {
            System.out.print(n + " la so chinh phuong");
        } else {
            System.out.print(n + " khong phai la so chinh phuong");
        }
    }
}
