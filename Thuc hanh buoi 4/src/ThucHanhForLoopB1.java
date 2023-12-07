import java.util.Scanner;

public class ThucHanhForLoopB1 {
    public static void main(String[] args) {
        System.out.println("Nhap vao 1 chuoi bat ky:");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine().toUpperCase().replaceAll("\\s", "");
        System.out.println(str);
        checkSymmetry(str);
    }

    static void checkSymmetry(String str) {
        if (str.length() % 2 == 0) {
            boolean isNotSymmetry = true;
            for (int i = 0; i < str.length() / 2; i++) {
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                    isNotSymmetry = false;
                    break;
                }
            }
            if (isNotSymmetry) {
                System.out.println("Chuoi da nhap la chuoi doi xung!");
            } else {
                System.out.println("Chuoi da nhap khong doi xung!");
            }
        } else {
            System.out.println("Chuoi ko hop le!");
        }
    }
}
