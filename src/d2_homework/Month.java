package d2_homework;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thang: ");
        int month = sc.nextInt();
        if (month >= 1 && month <= 12) {

            System.out.print("Nhap so nam: ");
            int year = sc.nextInt();
            int dayInMonth;
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    dayInMonth = 30;
                    break;
                case 2:
                    if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
                        dayInMonth = 29;
                    } else {
                        dayInMonth = 28;
                    }
                    break;
                default:
                    dayInMonth = 31;
            }
            System.out.printf("so ngay trong thang %d nam %d la %d ngay", month, year, dayInMonth);
        } else {
            System.out.println("khong hop le");
        }
    }
}
