import java.util.Scanner;

public class MenuTerminal {
    static boolean exitFunc;

    public static void main(String[] args) {

        while (!exitFunc) {
            showMenu();
        }
    }

    static void showMenu() {
        System.out.println("********** MENU **********");
        System.out.println("1. Thuc hien chuc nang 1");
        System.out.println("2. Thuc hien chuc nang 2");
        System.out.println("3. Thuc hien chuc nang 3");
        System.out.println("4. Thoat!");
        Scanner scn = new Scanner(System.in);
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap theo goi y cua menu!");
            scn.next();
        }
        int m = scn.nextInt();
        chooseFunction(m);
    }

    static void chooseFunction(int m) {
        switch (m) {
            case 1:
                firstFunction();
                break;
            case 2:
                secondFunction();
                break;
            case 3:
                thirdFunction();
                break;
            case 4:
                exitFunc = true;
                System.out.println("Thoat!");
                break;
            default:
                System.out.println("Ban can nhap chuc nang co trong menu!");
                break;
        }
    }

    static void firstFunction() {
        System.out.println("Chuc nang 1 duoc thuc hien!");
    }

    static void secondFunction() {
        System.out.println("Chuc nang 2 duoc thuc hien!");
    }

    static void thirdFunction() {
        System.out.println("Chuc nang 3 duoc thuc hien!");
    }
}
