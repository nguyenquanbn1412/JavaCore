import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Cau 1,2,3

        cau1();
        cau2();
        cau3();

//        Cau 4
        System.out.println("Tổng 2 số a và b là: " + sumTwoNumbers());

//        Cau 5
        System.out.println("Bình phương của số vừa nhập là: " + squareOfNumber());

//        Cau 6
        System.out.println("Thế kỷ của năm bạn vừa nhập là: Thế kỷ " + centuryOfYear());

//        Cau 7
        System.out.println("Chỉ số BMI của bạn là: " + bmiIndex());
    }

    //    Cau 1
    static void cau1() {
        System.out.println("Xin chào các bạn.");
    }

    //    Cau 2
    static void cau2() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn:");
        String strName = scn.nextLine();
        System.out.println("Xin chào " + strName);
    }

    //    Cau 3
    static void cau3() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn:");
        String strName = scn.nextLine();
        System.out.println("Xin chào \"" + strName + "\"");
    }

    //  Cau 4
    static double sumTwoNumbers() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào số a:");
        double a = scn.nextDouble();
        System.out.println("Nhập vào số b:");
        double b = scn.nextDouble();
        return a + b;
    }

    //    Cau 5
    static double squareOfNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào 1 số bất kỳ:");
        double a = scn.nextDouble();
        return a * a;
    }

    //    Cau 6
    static int centuryOfYear() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào 1 năm bất kỳ:");
        int a = scn.nextInt();
        return a / 100 + 1;
    }

    //    Cau 7
    static float bmiIndex() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập vào cân nặng của bạn:");
        float a = scn.nextFloat();
        System.out.println("Nhập vào chiều cao của bạn:");
        float b = scn.nextFloat();
        return a / (b * b);
    }
}