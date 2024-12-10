package ss3_java_overview;

import java.util.Scanner;

public class CalCarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap bien so xe: ");
        int n = sc.nextInt();
        int sum = n % 10;
        n = n / 10;
        sum = sum + n % 10;
        n = n / 10;
        sum = sum + n % 10;
        n = n / 10;
        sum = sum + n % 10;
        n = n / 10;
        sum = sum + n;
        System.out.println("so nut cua xe la: " + (sum % 10));
    }
}
