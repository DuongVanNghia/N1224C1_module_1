package ss9_array;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay/thang/nam: ");
        String date = sc.nextLine();
        LocalDate localDate = LocalDate.parse(date, formatter);
        localDate = localDate.plusYears(2);
        System.out.println(localDate.format(formatter));

    }
}
