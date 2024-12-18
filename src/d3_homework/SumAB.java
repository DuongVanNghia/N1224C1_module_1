package d3_homework;

import java.util.Scanner;

public class SumAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.print("nhap a: ");
            a = sc.nextInt();
            System.out.print("nhap b: ");
            b = sc.nextInt();
            if (a > b) {
                System.out.println("xin vui long nhap lai voi a>b: ");
            }
        } while (a > b);
        int quantitySymmet = 0;
        int sumSymmet = 0;
        int quantitySquare = 0;
        int sumSquare = 0;
        int quantityPrime = 0;
        int sumPrime = 0;

        for (int i = a; i <= b; i++) {
            String s = Integer.toString(i);
            boolean isPalindrom = true;
            for (int j = 0; j < s.length() / 2; j++) {
                if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
                    isPalindrom = false;
                    break;
                }
            }
            if (isPalindrom) {
                quantitySymmet++;
                sumSymmet += i;
            }
            if (Math.sqrt(i) % 1 == 0) {
                quantitySquare++;
                sumSquare += i;
            }
            boolean isPrime = true;
            if(i<2){
                isPrime = false;
            }
            for(int j=2;j<=Math.sqrt(i);j++){
                if(j%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                quantityPrime++;
                sumPrime += i;
            }
        }
        System.out.printf("so luong so doi xung cua %d va %d la: %d\n", a, b, quantitySymmet);
        System.out.printf("tong cua so doi xung cua %d va %d la: %d\n", a, b, sumSymmet);
        System.out.printf("so luong so chinh phuong cua %d va %d la: %d\n", a, b, quantitySquare);
        System.out.printf("tong cua so chinh phuong cua %d va %d la: %d\n", a, b, sumSquare);
        System.out.printf("so luong so nguyen to cua %d va %d la: %d\n", a, b, quantityPrime);
        System.out.printf("tong cua so nguyen to cua %d va %d la: %d\n", a, b, sumPrime);


    }
}
