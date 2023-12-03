import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat:");
        int m = scn.nextInt();
        System.out.println("Nhap vao so thu 2:");
        int n = scn.nextInt();
        checkMultiples(m, n);
    }

    static void checkMultiples(int m, int n) {
        for (int i = m; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz: " + i);
            }
//            else {
//
//            }
        }
    }
}
