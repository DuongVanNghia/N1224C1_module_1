package d2_homework;

import java.util.Scanner;

public class PrintOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.print("day so do la: ");
        for (int i =1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
