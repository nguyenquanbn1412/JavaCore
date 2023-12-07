import java.util.Scanner;

public class ThucHanhForLoopB3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen bat ky:");
        int m = checkIsNumber(scn);
        if (isPrimeNumber(m)) {
            System.out.println("So vua nhap la so nguyen to!");
        } else {
            System.out.println("So vua nhap khong phai la so nguyen to!");
        }
    }

    static int checkIsNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    static boolean isPrimeNumber(int m) {
        if (m <= 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(m); i++) {
                if (m % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
