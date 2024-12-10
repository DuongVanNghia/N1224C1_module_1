package ss3_java_overview;

import java.util.Scanner;

public class TaxMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten san pham la: ");
        String name = sc.nextLine();
        System.out.println("So luong san pham la: ");
        int quantity = sc.nextInt();
        System.out.println("Don gia san pham la: ");
        int money = sc.nextInt();
        System.out.println("Tong tien cua san pham la: " + (quantity * money));
        System.out.println("thue gia tri tang la: " + (quantity * money * 0.1));
    }
}
