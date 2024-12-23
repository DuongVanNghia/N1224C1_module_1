package ss9_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main5 {
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
        ArrayList<Integer> list = new ArrayList<Integer>();

//        inputArray(ArrayList);
//        outputArray( ArrayList);

    }

    public static void inputArray(ArrayList<Integer> arrayList,int n) {
        for(int i=0;i<n;i++){
            System.out.printf("Nhap phan tu arr[%d]",i);
           arrayList.add(sc.nextInt());
        }

    }
    public static void outputArray(ArrayList<Integer> arrayList){
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+"\t");
            System.out.printf("arr[%d]=%d",i,arrayList.get(i));
        }
    }
}
