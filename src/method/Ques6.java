package method;

import java.util.Scanner;

public class Ques6 {
    static String Name;
    static int age;
    static String sex;
    static double basicSalary, averageScore;

    static void nhapTT() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        Name = s.nextLine();
        System.out.print("Nhập tuổi: ");
        age = s.nextInt();
        s.nextLine();
        System.out.print("Nhập giới tính: ");
        sex = s.nextLine();
        System.out.print("Nhập mức lượng cơ bản: ");
        basicSalary = s.nextDouble();
        System.out.print("Nhập điểm trung bình tốt nghiệp: ");
        averageScore = s.nextDouble();
    }

    static void xuatTT() {
        System.out.println("Họ và tên: " + Name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + sex);
        System.out.println("Mức lương cơ bản: " + basicSalary);
        System.out.println("điểm trung bình: " + averageScore);
    }

    public static void main(String[] args) {
        nhapTT();
        xuatTT();
    }
}
