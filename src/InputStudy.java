import java.util.Scanner;

public class InputStudy {
    public static void main(String[] args) {
        //System.in:tieu chuan de nhap du lieu tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();
        System.out.print("Nhập tuổi");
        int  age = sc.nextInt();

        System.out.println("Tuổi"+ age);

    }
}
