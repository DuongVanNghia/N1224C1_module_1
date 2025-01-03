package result_module;

import java.util.Scanner;

public class Ques2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n ;
        do{

            System.out.println("nhap vao so luong phan tu mang: ");
            n = sc.nextInt();
            if(n<1) {
                System.out.println("vui long nhap lai mang");
            }
        }while (n<1);
        int[] arr = new int[n];

        inputArray(arr);
        outputArray(arr);
        sumChan(arr);
        System.out.println("sum chan trong mang la: \t"+sumChan(arr));
        sumLe(arr);
        System.out.println("sum le mang la: "+sumLe(arr));
        System.out.println("hieu cua: "+ (sumChan(arr)-sumLe(arr)));

    }

    public static void inputArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.printf("Nhap phan tu arr[%d]: ",i);
            arr[i] = sc.nextInt();
        }

    }
    public static void outputArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static int sumChan(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static int sumLe(int[] arr){
        int sum1 = 0;
        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                sum1+=i;
            }
        }
        return sum1;
    }
}
