package d2_homework;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so tham nien: ");
        double Month = sc.nextDouble();
        double Senoirity = 0;
        if (Month < 0) {
            System.out.println("khong hop le");
        } else if (Month < 12) {
            Senoirity = 1.92;
        } else if (Month < 36) {
            Senoirity = 2.34;
        } else if (Month < 60) {
            Senoirity = 3;
        } else {
            Senoirity = 4.5;
        }
        double Salary = 650000 * Senoirity;
        System.out.println("luong nguoi do nhan dc la: " + Salary);
    }
}
