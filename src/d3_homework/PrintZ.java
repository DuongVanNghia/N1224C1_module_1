package d3_homework;

import java.util.Scanner;

public class PrintZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        System.out.println("hinh a");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i==1||i==n||i==j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("hinh b");
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i==1||i==n||j==n-i+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}