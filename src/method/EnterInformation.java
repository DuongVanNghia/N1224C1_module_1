package method;

import java.util.Scanner;

public class EnterInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        do{
            System.out.println("=======menu=======");
            System.out.println("1.Nam");
            System.out.println("2.Nu");
            System.out.println("Moi ban chon gioi tinh: ");
            choose = sc.nextInt();
            if (choose!=1||choose!=2){
                System.out.println("lua chon khong hop le xin vui long nhap lai: ");
            }
        }while(choose!=1||choose!=2);
        System.out.println("Gioi tinh: " + choose );

    }

}
