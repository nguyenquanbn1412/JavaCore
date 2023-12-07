public class PrintShape {
    public static void main(String[] args) {
        Hinh1();
        Hinh2();
        Hinh3(11, 11);
        Hinh4();
    }

    static void Hinh1() {
        System.out.println("Hinh 1:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Hinh2() {
        System.out.println("Hinh 2:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 4 || j == 0 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void Hinh3(int m, int n) {
        System.out.println("Hinh 3:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == m - i - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void Hinh4() {
        System.out.println("Hinh 4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
