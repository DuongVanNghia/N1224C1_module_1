package method;

import java.util.Scanner;

public class Ques7 {
    static String name1;
    static int age1;
    static String sex1;
    static double basicSalary1, averageScore1;

    static String name2;
    static int age2;
    static String sex2;
    static double basicSalary2, averageScore2;

    static String name3;
    static int age3;
    static String sex3;
    static double basicSalary3, averageScore3;

    static String name4;
    static int age4;
    static String sex4;
    static double basicSalary4, averageScore4;

    static String name5;
    static int age5;
    static String sex5;
    static double basicSalary5, averageScore5;


    static void nhapTT1() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name1 = s.nextLine();
        System.out.print("Nhap tuoi: ");
        age1 = s.nextInt();
        s.nextLine();
        System.out.print("Nhap gioi tinh: ");
        sex1 = s.nextLine();
        System.out.print("Nhap muc luong co ban: ");
        basicSalary1 = s.nextDouble();
        System.out.print("Nhap diem tung binh tot nghiep: ");
        averageScore1 = s.nextDouble();
    }

    static void nhapTT2() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name2 = s.nextLine();
        System.out.print("Nhap tuoi: ");
        age2 = s.nextInt();
        s.nextLine();
        System.out.print("Nhap gioi tinh: ");
        sex2 = s.nextLine();
        System.out.print("Nhap muc luong co ban: ");
        basicSalary2 = s.nextDouble();
        System.out.print("Nhap diem tung binh tot nghiep: ");
        averageScore2 = s.nextDouble();
    }

    static void nhapTT3() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name3 = s.nextLine();
        System.out.print("Nhap tuoi: ");
        age3 = s.nextInt();
        s.nextLine();
        System.out.print("Nhap gioi tinh: ");
        sex3 = s.nextLine();
        System.out.print("Nhap muc luong co ban: ");
        basicSalary3 = s.nextDouble();
        System.out.print("Nhap diem tung binh tot nghiep: ");
        averageScore3 = s.nextDouble();
    }

    static void nhapTT4() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name4 = s.nextLine();
        System.out.print("Nhap tuoi: ");
        age4 = s.nextInt();
        s.nextLine();
        System.out.print("Nhap gioi tinh: ");
        sex4 = s.nextLine();
        System.out.print("Nhap muc luong co ban: ");
        basicSalary4 = s.nextDouble();
        System.out.print("Nhap diem tung binh tot nghiep: ");
        averageScore4 = s.nextDouble();
    }

    static void nhapTT5() {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        name5 = s.nextLine();
        System.out.print("Nhap tuoi: ");
        age5 = s.nextInt();
        s.nextLine();
        System.out.print("Nhap gioi tinh: ");
        sex5 = s.nextLine();
        System.out.print("Nhap muc luong co ban: ");
        basicSalary5 = s.nextDouble();
        System.out.print("Nhap diem tung binh tot nghiep: ");
        averageScore5 = s.nextDouble();
    }

    static void xuatTT1() {
        System.out.println("Ho va ten: " + name1);
        System.out.println("tuoi: " + age1);
        System.out.println("Gioi tinh: " + sex1);
        System.out.println("Muc luong co ban: " + basicSalary1);
        System.out.println("Diem trung binh tot nghiep: " + averageScore1);
    }

    static void xuatTT2() {
        System.out.println("Ho va ten: " + name2);
        System.out.println("tuoi: " + age2);
        System.out.println("Gioi tinh: " + sex2);
        System.out.println("Muc luong co ban: " + basicSalary2);
        System.out.println("Diem trung binh tot nghiep: " + averageScore2);
    }

    static void xuatTT3() {
        System.out.println("Ho va ten: " + name3);
        System.out.println("Tuoi: " + age3);
        System.out.println("Gioi tinh: " + sex3);
        System.out.println("Muc luong co ban: " + basicSalary3);
        System.out.println("Diem trung binh tot nghiep: " + averageScore3);
    }

    static void xuatTT4() {
        System.out.println("Ho va ten: " + name4);
        System.out.println("Tuoi: " + age4);
        System.out.println("Gioi tinh: " + sex4);
        System.out.println("Muc luong co ban: " + basicSalary4);
        System.out.println("Diem trung binh tot nghiep: " + averageScore4);
    }

    static void xuatTT5() {
        System.out.println("Ho va ten: " + name5);
        System.out.println("Tuoi: " + age5);
        System.out.println("Gioi tinh: " + sex5);
        System.out.println("Muc luong co ban: " + basicSalary5);
        System.out.println("Diem trung binh tot nghiep: " + averageScore5);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong nhanh vien muon nhap: ");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.println("Nhan vien thu 1");
                nhapTT1();
                System.out.println("Thong tin nhan vien 1");
                xuatTT1();
                break;
            case 2:
                System.out.println("Nhan vien thu 1");
                nhapTT1();
                System.out.println("Nhan vien thu 2");
                nhapTT2();
                System.out.println("Thong tin nhan vien 1");
                xuatTT1();
                System.out.println("Thong tin nhan vien 2");
                xuatTT2();
                break;
            case 3:
                System.out.println("Nhan vien thu 1");
                nhapTT1();
                System.out.println("Nhan vien thu 2");
                nhapTT2();
                System.out.println("Nhan vien thu 3");
                nhapTT3();
                System.out.println("Thong tin nhan vien 1");
                xuatTT1();
                System.out.println("Thong tin nhan vien 2");
                xuatTT2();
                System.out.println("Thong tin nhan vien 3");
                xuatTT3();
                break;
            case 4:
                System.out.println("Nhan vien thu 1");
                nhapTT1();
                System.out.println("Nhan vien thu 2");
                nhapTT2();
                System.out.println("Nhan vien thu 3");
                nhapTT3();
                System.out.println("Nhan vien thu 4");
                nhapTT4();
                System.out.println("Thong tin nhan vien 1");
                xuatTT1();
                System.out.println("Thong tin nhan vien 2");
                xuatTT2();
                System.out.println("Thong tin nhan vien 3");
                xuatTT3();
                System.out.println("Thong tin nhan vien 4");
                xuatTT4();
                break;
            case 5:
                System.out.println("Nhan vien thu 1");
                nhapTT1();
                System.out.println("Nhan vien thu 2");
                nhapTT2();
                System.out.println("Nhan vien thu 3");
                nhapTT3();
                System.out.println("Nhan vien thu 4");
                nhapTT4();
                System.out.println("Nhan vien thu 5");
                nhapTT5();
                System.out.println("Thong tin nhan vien 1");
                xuatTT1();
                System.out.println("Thong tin nhan vien 2");
                xuatTT2();
                System.out.println("Thong tin nhan vien 3");
                xuatTT3();
                System.out.println("Thong tin nhan vien 4");
                xuatTT4();
                System.out.println("Thong tin nhan vien 5");
                xuatTT5();
                break;
            default:
                return;
        }

    }
}
