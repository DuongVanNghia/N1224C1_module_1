package d2_homework;

import java.util.Scanner;

public class Changedate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        int date = sc.nextInt();
        if (date < 1 && date > 12) {
            System.out.println("khong hop le");
            return;
        }
        System.out.println("Nhap thang: ");
        int month = sc.nextInt();
        if (month < 1 && month > 12) {
            System.out.println("khong hop le");
            return;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (date == 31) {
                System.out.println("khong hop le");
                return;
            }
        }
        System.out.println("Nhap nam: ");
        int year = sc.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (month == 2) {
            if (isLeapYear) {
                if (date > 29) {
                    System.out.println("ngay khong hop le");
                    return;
                }
            } else {
                if (date > 28) {
                    System.out.println("ngay khong hop le");
                    return;
                }
            }
        }
        System.out.println("ngay hop le");
        int nextDate = date;
        int nextMonth = month;
        int nextYear = year;
        nextDate++;
        if ((nextDate > 31 || (month == 2 && nextDate > (isLeapYear ? 29 : 28)) || (month == 4 || month == 6 || month == 9 || month == 11))) {
            nextDate = 1;
            nextMonth++;
        }
        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
        System.out.printf("ngay ke tiep la: %d/%d/%d", nextDate, nextMonth, nextYear);
        int previousDate = date;
        int previousMonth = month;
        int previousYear = year;
        previousDate--;
        if (previousDate < 1) {
            previousMonth--;
            if (previousMonth < 1) {
                previousMonth = 12;
                previousYear--;
            }
            if (previousMonth == 4 || previousMonth == 6 || previousMonth == 9 || previousMonth == 11) {
                previousDate = 30;
            } else if (previousMonth == 2) {
                if (isLeapYear) {
                    previousDate = 29;
                } else {
                    previousDate = 28;
                }


            } else {
                previousDate = 31;
            }
        }
        System.out.println();
        System.out.printf("ngay truoc do:%d/%d/%d", previousDate, previousMonth, previousYear);
    }
}
