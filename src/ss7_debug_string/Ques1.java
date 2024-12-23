package ss7_debug_string;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World";

        System.out.println("Lay chu World: " + str.substring(6));

        System.out.println("Thay o thanh f: " + str.replaceAll("o", "f"));

        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println(" so ki tu l: " + count);

        System.out.println("Vi tri cuat hien dau tien: " + str.indexOf('l'));
        System.out.println("Vi tri xuat hien cuoi cung: " + str.lastIndexOf('l'));

        System.out.println("Xoa het space giua chung,dau tien va cuoi cung: " +
                str.replaceAll(" ", ""));

        System.out.println(" Xoa het space dau tien va cuoi cung: " + str.trim());

        String daoChuoi = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            daoChuoi += str.charAt(i);
        }
        System.out.println("Dao chuoi: " + daoChuoi);

        System.out.println("SQC ".concat(str));

        System.out.println("Doi toan bo ki tu s sang in hoa: " + str.toUpperCase());

        System.out.println("Doi toan bo ki tu s sang in thuong: " + str.toLowerCase());

        System.out.println("Trich ra chuoi ki tu tu thu tu n den m cua s");
        System.out.print("Nhap n: ");
        int n = sc.nextInt();

        System.out.print("Nhap m: ");
        int m = sc.nextInt();

        System.out.printf("Chuoi con tu ki tu %d den %d: %s", n, m, str.substring(n, m));

    }
}
