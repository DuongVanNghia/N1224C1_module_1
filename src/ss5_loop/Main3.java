package ss5_loop;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score;
        do {
            System.out.print("nhap diem: ");
            score = sc.nextDouble();
            if (score < 0 || score > 10) {
                System.out.println("diem nhap khong hop le,nhap tu 0 den 10,vui long nhap lai");
            }
        } while (score < 0 || score > 10);
        System.out.println("diem: " + score);
    }
}
