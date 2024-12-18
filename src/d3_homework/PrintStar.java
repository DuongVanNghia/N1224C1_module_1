package d3_homework;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {//hang
            for (int j = 1; j <= n; j++) {//cot
                if(i==1||j==1||i==n||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
