package d3_homework;

import java.util.Scanner;

public class CalMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tien mon do: ");
        int moneyItem = sc.nextInt();
        System.out.println("Nhap so tien khach tra: ");
        int moneyCustomer = sc.nextInt();
        int changeMoneyBack = moneyCustomer - moneyItem;
        int moneyDenomination;
        for (int i = 2; i >= 0; i--) {
            int refactor = (int) Math.pow(10, i);

            moneyDenomination = 500 * refactor;
            if (changeMoneyBack
                    >= moneyDenomination) {
                System.out.printf("%d to %d\n", changeMoneyBack / moneyDenomination, moneyDenomination);
                changeMoneyBack %= moneyDenomination;
            }

            moneyDenomination = 2000 * refactor;
            if (changeMoneyBack >= moneyDenomination) {
                System.out.printf("%d to %d\n", changeMoneyBack / moneyDenomination, moneyDenomination);
            }

            moneyDenomination = 1000 * refactor;
            if (changeMoneyBack >= moneyDenomination) {
                System.out.printf("%d to %d\n", changeMoneyBack / moneyDenomination, moneyDenomination);
            }

        }
    }
}
