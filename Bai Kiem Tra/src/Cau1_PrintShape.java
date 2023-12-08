import java.util.Scanner;

public class Cau1_PrintShape {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhap do dai canh :");
        int m = checkIsNumber(scn);
        System.out.println("Hinh vuong va hinh tam giac voi do dai vua nhap:");
        drawSquare(m);
        drawTriangle(m);
    }

    //Kiem tra thao tac nhap so
    static int checkIsNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }


    //Ve hinh vuong
    static void drawSquare(int m) {
        System.out.println("Hinh vuong:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //Ve hinh tam giac
    static void drawTriangle(int m) {
        System.out.println("Hinh tam giac:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
