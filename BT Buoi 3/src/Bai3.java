import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky:");
        String str = scn.nextLine();
        System.out.println("Nhap so lan lap:");
        int n = scn.nextInt();
        multipleTimes(str, n);
    }

    static void multipleTimes(String str, int n) {
        System.out.println("Chuoi sau khi sao chep n lan:");
        for (int i = 1; i <= n - 1; i++) {
            System.out.print(str + "-");
        }
        System.out.print(str);
    }
}
