package ss3_java_overview;

import java.util.Scanner;

public class CalAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem mon toan: ");
        double pointM = sc.nextDouble();
        System.out.println("NHap hệ số moon toán: ");
        double hM = sc.nextDouble();
        System.out.println("nhap diem mon lí: ");
        double pointL = sc.nextDouble();
        System.out.println("nhap hệ số môn Lí: ");
        double hL = sc.nextDouble();
        System.out.println("nhap diem mon hóa: ");
        double pointH = sc.nextDouble();
        System.out.println("nhap he so mon hóa: ");
        double hH = sc.nextDouble();
        System.out.println("Điểm trung bình của học sinh là: " + ((pointM * hM + pointL * hL + pointH * hH) / (hM + hL + hH)));
    }
}
