package result_module;

import java.util.Scanner;

public class Ques5 {
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

        System.out.println("so lon thu 2 mang la: "+lonNhi(arr));

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
    public static int lonNhi(int[] arr){
        int max=0;
        int secondMax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]<secondMax&&arr[i]<max) {
                secondMax=arr[i];
                
            }



        }
        return secondMax;
    }
}
