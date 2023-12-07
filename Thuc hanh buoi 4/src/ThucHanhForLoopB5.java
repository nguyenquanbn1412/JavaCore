import java.util.Scanner;

public class ThucHanhForLoopB5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen duong bat ky:");
        int m = checkIsNumber(scn);
        System.out.println("Tong cac uoc so cua so vua nhap la: " + sumOfDivisor(m));
    }

    static int checkIsNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    static int sumOfDivisor(int m) {
        int sum = 0;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
