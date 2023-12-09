import java.util.Scanner;

public class ThucHanhArrB2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky:");
        repeatTenTimes(scn.nextLine(), 10);
    }

    static void repeatTenTimes(String str, int m) {
        System.out.println("Chuoi sau khi sao chep " + m + " lan la: ");
        String[] arrStr = new String[m];
        for (int i = 0; i < m; i++) {
            arrStr[i] = str;
            System.out.print(arrStr[i]);
        }
    }
}
