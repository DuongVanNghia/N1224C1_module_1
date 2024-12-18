package d3_homework;

import java.util.Scanner;

public class PrintTrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap n: ");
        int n = sc.nextInt();
        System.out.println("hinh a");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hinh b");
        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hinh c");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hinh d");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hinh e");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i+1 ; j++) {
                if(i==1||j==1||j==n-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("hinh f");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2* i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("hinh g");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j >= 2*i-1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
