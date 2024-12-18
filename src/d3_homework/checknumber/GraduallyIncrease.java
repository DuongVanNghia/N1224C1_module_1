package d3_homework.checknumber;

import java.util.Scanner;

public class GraduallyIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        boolean isGradually = true;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) >= s.charAt(i + 1)) {
                isGradually = false;
                break;
            }
        }
            if (isGradually) {
                System.out.println("la day so tang dan");
            } else {
                System.out.println("la day so khong tang dan");
            }


    }
}
