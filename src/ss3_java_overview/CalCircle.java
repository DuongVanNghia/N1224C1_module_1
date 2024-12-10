package ss3_java_overview;

import java.util.Scanner;

public class CalCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap ban kinh duong tron: ");
        double r = sc.nextDouble();
        System.out.println("Chu vi cua duong tron la: " + (2 * Math.PI * r));
        System.out.println(" dien tich cua duong tron là: " + (Math.PI * r * r));
    }
}
