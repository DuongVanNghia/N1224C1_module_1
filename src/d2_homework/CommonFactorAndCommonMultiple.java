package d2_homework;

import java.util.Scanner;

public class CommonFactorAndCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = sc.nextInt();
        System.out.println("nhap b: ");
        int b = sc.nextInt();
        int Fator = 1;
        if(a>b){

        }
        for (int i = a; i >= 1; i--) {
            if (b % i == 0 && a % i == 0) {
                Fator = i;
                break;
            }
        }
        int Multi;
        for (int i = a; true; i++) {
            if (i % b == 0 && i % a == 0) {
                Multi = i;
                break;
            }
        }
        System.out.println(Fator + " la uoc so chung lon nhat");
        System.out.println(Multi + " la boi so chung nho nhat");
    }
}
