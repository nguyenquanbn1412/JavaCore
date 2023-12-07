import java.util.Scanner;

public class ThucHanhForLoopB4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen duong bat ky: ");
        int m = checkIsNumber(scn);
        System.out.println("Tong cac so nguyen to nho hon hoac bang so vua nhap la: " + sumOfPrimeNumber(m));
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

    static int sumOfPrimeNumber(int m) {
        int sum = 0;
        for (int i = 2; i <= m; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
