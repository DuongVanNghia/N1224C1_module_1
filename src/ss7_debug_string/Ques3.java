package ss7_debug_string;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi a: ");
        String a = sc.nextLine();
        System.out.println("nhap chuoi b: ");
        String b = sc.nextLine();
        int compare = a.compareTo(b);
        if (compare < 0) {
            System.out.println("a<b");
        }else if (compare == 0) {
            System.out.println("a==b");
        }else{
            System.out.println("a>b");
        }
    }
}
