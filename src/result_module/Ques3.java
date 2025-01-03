package result_module;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi in hoa: ");
        String s = sc.nextLine();
        int demInHoa = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                demInHoa++;
            }
        }
        if (demInHoa == 0) {
            System.out.println("khong co ki tu in hoa nao");
        }else{
            System.out.println("khong co ki tu in hoa " + demInHoa);
        }
    }
}