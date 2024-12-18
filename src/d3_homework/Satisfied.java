package d3_homework;

public class Satisfied {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        for (int i = 10; i <= 99; i++) {
            int tensDigit = i / 10;
            int onesDigit = i % 10;
            int sumDigit = tensDigit + onesDigit;
            int product = tensDigit * onesDigit;
            if (product == 2 * sumDigit) {
                System.out.print(i + " ");
            }
        }
    }
}
