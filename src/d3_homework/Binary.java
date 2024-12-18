package d3_homework;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so thap phan: ");
        int n = sc.nextInt();
        String binary = "";
        while (n > 0) {
            binary = n % 2 + binary;
            n /= 2;
        }
        System.out.println(binary);
    }
}
