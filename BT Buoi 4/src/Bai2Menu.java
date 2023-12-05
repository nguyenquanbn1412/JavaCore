import java.util.Scanner;

public class Bai2Menu {
    public static void main(String[] args) {
        menuArrOption();
    }

    static void menuArrOption() {
        Scanner scn = new Scanner(System.in);
        int m = 0;
        System.out.println("Ban chuan bi khoi tao mang, hay nhap so phan tu cho mang: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        while (m != 4) {

            System.out.println("**********MENU**********");
            System.out.println("1. Nhap cac phan tu cho mang");
            System.out.println("2. In mang ra man hinh");
            System.out.println("3. Thay doi so chan trong mang (Neu co)");
            System.out.println("4. Thoat");
            m = scn.nextInt();
            switch (m) {
                case 1:
                    inputForArr(scn, arr);
                    break;
                case 2:
                    printArr(arr);
                    break;
                case 3:
                    changeArr(arr);
                    break;
                case 4:
                    System.out.println("Good bye!");
                    break;
                default:
                    System.out.println("Ban can nhap theo goi y cua menu!");
                    break;
            }
        }
    }

    static void inputForArr(Scanner scn, int[] arr) {
        if (arr.length > 0) {
            System.out.println("Nhap tung phan tu cho mang:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scn.nextInt();
            }
        } else {
            System.out.println("Mang khong hop le!");
        }

    }

    static void printArr(int[] arr) {
        if (arr.length > 0) {
            System.out.println("In mang ra man hinh:");
            for (int j : arr) {
                System.out.print(j + " ");
            }
            System.out.println();
        } else {
            System.out.println("Mang khong hop le!");
        }
    }

    static void changeArr(int[] arr) {
        if (arr.length > 0) {
            System.out.println("Mang sau khi tang cac so chan len 1 don vi:");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    arr[i]++;
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Mang khong hop le!");
        }
    }
}