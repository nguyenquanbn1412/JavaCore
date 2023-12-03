import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi bat ky:");
        String str = scn.nextLine();
        multipleTenTimes(str);
    }

    static void multipleTenTimes(String str) {
        System.out.println("Chuoi sau khi sao chep 10 lan voi dau \"-\"");
        for (int i = 1; i <= 9; i++) {
            System.out.print(str + "-");
        }
        System.out.print(str);
    }
}
