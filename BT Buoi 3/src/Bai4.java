import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat:");
        int m = scn.nextInt();
        System.out.println("Nhap vao so thu 2:");
        int n = scn.nextInt();
        sumOfNumber(m, n);
    }

    static void sumOfNumber(int m, int n) {
        int sum = 0;
        for (int i = m; i <= n; i += 5) {
            sum+=i;
        }
        System.out.println("Tong cac so chia het cho 5 tu so thu nhat den so thu 2 la: " + sum);
    }
}
