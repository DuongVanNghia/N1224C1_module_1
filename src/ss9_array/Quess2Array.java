package ss9_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Quess2Array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> fullName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Integer> gender = new ArrayList<>();
        ArrayList<Double> salary = new ArrayList<>();
        ArrayList<Double> avgScore = new ArrayList<>();

        System.out.print("Nhập số lượng nhân viên: ");
        int n = Integer.parseInt(sc.nextLine());

        inputEmployee(fullName, age, gender, salary, avgScore, n);
        outputEmployee(fullName, age, gender, salary, avgScore);
    }

    public static void inputEmployee(ArrayList<String> fullName, ArrayList<Integer> age, ArrayList<Integer> gender, ArrayList<Double> salary, ArrayList<Double> avgScore, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập tên nhân viên thứ %d: ", i + 1);
            fullName.add(sc.nextLine());

            System.out.printf("Nhập tuổi nhân viên thứ %d: ", i + 1);
            age.add(Integer.parseInt(sc.nextLine()));

            int g;
            do {
                System.out.printf("Chọn giới tính nhân viên thứ %d \n1. Nam\n2. Nữ\n3. Khác \nLựa chọn của bạn là: ", i + 1);
                g = Integer.parseInt(sc.nextLine());
                if (g > 3 || g < 1) {
                    System.out.println("Giới tính không hợp lệ, vui lòng nhập lại!");
                }
            } while (g > 3 || g < 1);
            gender.add(g);

            System.out.printf("Nhập lương nhân viên thứ %d: ", i + 1);
            salary.add(Double.parseDouble(sc.nextLine()));

            double score;
            do {
                System.out.printf("Nhập điểm trung bình nhân viên thứ %d: ", i + 1);
                score = Double.parseDouble(sc.nextLine());
                if (score < 0 || score > 10) {
                    System.out.println("Điểm trung bình không hợp lệ, vui lòng nhập lại!");
                }
            } while (score < 0 || score > 10);
            avgScore.add(score);
        }
    }

    public static void outputEmployee(ArrayList<String> fullName, ArrayList<Integer> age, ArrayList<Integer> gender, ArrayList<Double> salary, ArrayList<Double> avgScore) {
        System.out.println("Danh sách nhân viên: ");
        for (int i = 0; i < fullName.size(); i++) {
            System.out.printf("======Nhân viên thứ %d======\n", i + 1);
            System.out.println("Tên: " + fullName.get(i));
            System.out.println("Tuổi: " + age.get(i));
            System.out.println("Giới tính: " + (gender.get(i) == 1 ? "Nam" : gender.get(i) == 2 ? "Nữ" : "Khác"));
            System.out.println("Lương: " + salary.get(i));
            System.out.println("Điểm trung bình: " + avgScore.get(i));
        }
    }
}
