package result_module;

import java.util.Scanner;

public class Ques4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n ;
        do{

            System.out.println("nhap vao so luong phan tu mang");
            n = sc.nextInt();
            if(n<1) {
                System.out.println("vui long nhap lai mang");
            }
        }while (n<1);
        int[] arr = new int[n];

        inputArray(arr);
        outputArray(arr);
        System.out.println("so nguyen to la: ");
        numPrime(arr);

    }

    public static void inputArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.printf("Nhap phan tu arr[%d]",i);
            arr[i] = sc.nextInt();
        }

    }
    public static void outputArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void numPrime(int[] arr) {
        for (int item : arr) {
            if (isPrime(item)) {
                System.out.print(item+ " ");
            }
        }
    }

}
