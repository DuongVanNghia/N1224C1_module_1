package ss3_java_overview;

import java.util.Scanner;

public class CalAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nam sinh: ");
        int namsinh = sc.nextInt();
        int age=2024-namsinh;
        System.out.println("Tuoi cua nguoi do la: " + age);
    }
}
//how to+..+in java