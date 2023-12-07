import java.util.Scanner;

public class ThucHanhArray {
    public static void main(String[] args) {
        menuArrOption();
    }

    static int checkIsNumber(Scanner scn) {
        while (!scn.hasNextInt()) {
            System.out.println("Ban can nhap vao 1 so nguyen!");
            scn.next();
        }
        return scn.nextInt();
    }

    static void menuArrOption() {
        Scanner scn = new Scanner(System.in);
        int m = 0;
        //Khoi tao mang
        System.out.println("Ban chuan bi khoi tao mang, hay nhap so phan tu cho mang: ");
        int n = checkIsNumber(scn);
        if (n > 0) {
            int[] arr = new int[n];

            //Nhap cac phan tu
            System.out.println("Nhap tung phan tu cho mang:");
            for (int i = 0; i < n; i++) {
                arr[i] = checkIsNumber(scn);
            }

            //Thuc hien cac chuc nang
            while (m != 4) {
                System.out.println("**********MENU**********");
                System.out.println("1. In ra các phần tử trong mảng");
                System.out.println("2. Tính tổng các phần tử trong mảng");
                System.out.println("3. Tìm phần tử nhỏ nhất");
                System.out.println("4. Tìm phần tử lớn nhất");
                System.out.println("5. Đếm số lượng phần tử chẵn");
                System.out.println("6. Đếm số lượng phần tử lẻ");
                System.out.println("7. Thoát!");
                m = checkIsNumber(scn);
                switch (m) {
                    case 1:
                        printArr(arr);
                        break;
                    case 2:
                        sumOfArr(arr);
                        break;
                    case 3:
                        //changeArr(arr);
                        break;
                    case 4:
                        System.out.println("Good bye!");
                        break;
                    default:
                        System.out.println("Ban can nhap theo goi y cua menu!");
                        break;
                }
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

    static void sumOfArr(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Tong cac phan tu trong mang la: " + sum);
    }

    static void minOfArr(int[] arr) {

    }
}