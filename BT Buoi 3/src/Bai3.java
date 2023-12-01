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
        String strFinal = "";
        for (int i = 1; i <= n-1; i++) {
            strFinal = strFinal + str + "-";
        }
        strFinal += str;
        System.out.println("Chuoi sau khi sao chep n lan: " + strFinal);
    }
}
