package d2_homework;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        double a = sc.nextDouble();
        System.out.print("nhap b: ");
        double b = sc.nextDouble();
        System.out.print("nhap c: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh vo so nghiem");
                } else {
                    System.out.println("phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.print("phuong trinh co nghiem la: " + x);
            }
        } else {
            if (delta < 0) {
                System.out.print("phuong trinh vo  nghiem");
            } else if (delta == 0) {
                double x = b / (2 * a);
                System.out.print("phuong trinh co nghiem la: " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co nghiem la: " + x1);
                System.out.println("phuong trinh co nghiem la: " + x2);
            }
        }
    }
}
