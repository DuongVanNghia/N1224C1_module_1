package d3_homework.checknumber;

import java.util.Scanner;

public class SymmetricalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        String s = Integer.toString(n);
        boolean isPalindrome = true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                System.out.println("khong phai la so doi xung");
                isPalindrome = false;
                break;
            }
            if(isPalindrome){
                System.out.println("la so doi xung");
                break;
            }
        }
    }
}
