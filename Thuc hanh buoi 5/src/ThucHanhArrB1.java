import java.util.Scanner;

public class ThucHanhArrB1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ban dang khoi tao mang, nhap so phan tu cua mang:");
        int m = checkIsNumber(scn);
        if (m <= 0) {
            System.out.println("Ban can nhap 1 so nguyen duong!");
            return;
        }
        int[] arr = new int[m];
        arrOption(arr, scn);
    }

    static int checkIsNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    static void arrOption(int[] arr, Scanner scn) {
        int[] secondArr = new int[arr.length];
        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = checkIsNumber(scn);
            secondArr[i] = arr[i] % 2;
        }
        System.out.println("Mang moi sau khi chia lay du cho 2 la:");
        for (int arrItem : secondArr) {
            System.out.print(arrItem + "\t");
        }
    }
}
