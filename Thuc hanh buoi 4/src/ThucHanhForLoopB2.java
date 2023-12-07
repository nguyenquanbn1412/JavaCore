import java.util.Scanner;

public class ThucHanhForLoopB2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int a = checkIsNumber(scn);
        System.out.println("Nhap vao so thu hai: ");
        int b = checkIsNumber(scn);
        System.out.println("Tong cac so nam giua 2 so vua nhap la: " + sumOfNumbers(a, b));
    }

    static int checkIsNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    static int sumOfNumbers(int a, int b) {
        int temp, sum = 0;
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        for (int i = a + 1; i < b; i++) {
            sum += i;
        }
        return sum;
    }
}
