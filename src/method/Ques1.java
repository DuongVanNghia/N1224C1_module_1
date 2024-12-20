package method;

public class Ques1 {
    public static void main(String[] args) {
        char character = 'A';
        System.out.println("Bài 1 " + toLowerCase(character));

        double a = 2, b = 3, c = 2;
        System.out.println("Bài 2");
        giaiPhuongTrinhBac1(a, b);

        System.out.println("Bài 3");
        giaiPhuongTrinhBac2(a, b, c);
        System.out.println("bài 4");
        int a1 = 2, b1 = 3, c1 = 2, d1 = 3;
        System.out.println(min(a1, b1, c1, d1));


    }

    private static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            c += 32;
        }
        return c;
    }

    private static void giaiPhuongTrinhBac1(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vô số nghiệm");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.println("Nghiem cua phuong trinh la x = " + x);
        }
    }

    private static void giaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vô số nghiệm");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.println("Nghiem cua phuong trinh la x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Nghiem cua phuong trinh la x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Nghiem cua phuong trinh la x1 = " + x1 + " va x2 = " + x2);
            }
        }
    }

    private static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;

    }
}