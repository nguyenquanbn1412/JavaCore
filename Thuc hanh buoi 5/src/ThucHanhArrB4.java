import java.util.Scanner;

public class ThucHanhArrB4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ban dang khoi tao mang, hay nhap so phan tu:");
        int m = checkIsNumber(scn);
        if (m <= 0) {
            System.out.println("Ban can nhap 1 so nguyen duong!");
            return;
        }
        int[] arr = new int[m];
        inputForArr(arr, scn);
        System.out.println("Nhap vao 1 gia tri bat ky:");
        int n = checkIsNumber(scn);

        if (checkElementExist(arr, n)) {
            System.out.println(n + " la 1 gia tri cua mang!");
        } else {
            System.out.println(n + " la 1 gia tri khong co trong mang!");
        }
    }

    static int checkIsNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    static void inputForArr(int[] arr, Scanner scn) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = checkIsNumber(scn);
        }
    }

    static boolean checkElementExist(int[] arr, int n) {
        for (int j : arr) {
            if (j == n) {
                return true;
            }
        }
        return false;
    }
}
