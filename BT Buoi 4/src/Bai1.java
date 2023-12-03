import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao ho ten cua ban:");
        String fullName = scn.nextLine();
        standardForName(fullName);
    }

    static void standardForName(String fullName) {
        String[] arrFullName = fullName.split("");
        System.out.println("Ho ten theo cach viet tieu chuan la: ");
        System.out.print(arrFullName[0].toUpperCase());
        for (int i = 1; i < arrFullName.length; i++) {
            if (arrFullName[i - 1].equals(" ")) {
                System.out.print(arrFullName[i].toUpperCase());
            } else {
                System.out.print(arrFullName[i]);
            }
        }
    }
}
