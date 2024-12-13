package ss4_condition;

import java.util.Scanner;

public class FirstOrderEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = sc.nextInt();
        System.out.print("nhap b: ");
        int b = sc.nextInt();
        if(a==0) {
            if(b==0) {
                System.out.println("phuong trinh vo so nghiem");
            }else{
                System.out.println("phuong trinh vo  nghiem");
            }
        }else{
            System.out.println(-b/a);
        }
    }
}
