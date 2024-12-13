package ss4_condition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        double score = sc.nextDouble();
        if (score >10||score <0) {
            System.out.println("khong hop le");
        } else if ( score < 5) {
            System.out.println("Yeu");
        }else if (score <= 6.5) {
            System.out.println("trung binh");
        } else if (score <8) {
            System.out.println("kha");
        }else{
            System.out.println("tot");
        }

    }
}
