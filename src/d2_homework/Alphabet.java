package d2_homework;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chu cai");
        char word = sc.next().charAt(0);
        if (word >= 'a' && word <= 'z' || word >= 'A' && word <= 'Z') {
            if (word >= 'a' && word <= 'z') {
                word -= 32;
            } else {
                word += 32;
            }
            System.out.print("ki tu sau khi doi la: " + word);
        } else {
            System.out.println("khong hop le");
        }
    }
}
